package com.example.retrofitminiworkshop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.retrofitminiworkshop.model.Anime
import com.example.retrofitminiworkshop.model.TopAnime
import com.example.retrofitminiworkshop.retrofit.ApiMain
import com.google.gson.Gson
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        getTopAnime()
        searchAnime("Naruto")
    }

    fun getTopAnime() {
        ApiMain().services.getTopAnime().enqueue(object : Callback<TopAnime> {
            override fun onFailure(call: Call<TopAnime>, t: Throwable) {
                Log.d("ApiRequestFailure: ", t.message.toString())
            }

            override fun onResponse(call: Call<TopAnime>, response: Response<TopAnime>) {
                if (response.code() == 200) {
                    response.body()?.top?.let {
                        // Proses
                        for (data in it) {
                            Log.d("ResultTopAnime: ", data!!.title + ", \n")
                            if (title == "Naruto") {
                                Log.d("ResultTopAnime: ", "Ketemu, $title")
                            }
                        }
                    }
                } else {
                    Log.d("ApiRequestFailure: ", response.code().toString())
                }
            }

        })
    }

    fun searchAnime(title: String?) {
        ApiMain().services.getAnimeResult(title).enqueue(object : Callback<Anime> {
            override fun onFailure(call: Call<Anime>, t: Throwable) {
                Log.d("ApiRequestFailure: ", t.message.toString())
            }

            override fun onResponse(call: Call<Anime>, response: Response<Anime>) {
                if (response.code() == 200) {
                    response.body()?.results?.let {
                        for (data in it) {
                            Log.d("ResultTopAnime: ", data!!.title + ", \n")
                            if (title == "Naruto") {
                                Log.d("ResultTopAnime: ", "Ketemu, $title")
                            }
                        }
                    }
                } else {
                    Log.d("ApiRequestFailure: ", response.code().toString())
                }
            }

        })
    }
}