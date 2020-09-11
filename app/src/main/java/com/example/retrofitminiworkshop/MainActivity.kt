package com.example.retrofitminiworkshop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.retrofitminiworkshop.model.Anime
import com.example.retrofitminiworkshop.model.TopAnime
import com.example.retrofitminiworkshop.retrofit.ApiMain
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
                    response.body()?.top?.let { result ->
                        // Proses
//                        for (data in result) {
//                            Log.d("ResultTopAnime: ", data!!.title + ", \n")
//                        }
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
                    response.body()?.results?.let { result ->
                        for (data in result) {
                            Log.d("ResultSearchAnime: ", data!!.title + ", \n")
                        }
                    }
                } else {
                    Log.d("ApiRequestFailure: ", response.code().toString())
                }
            }

        })
    }
}