package org.pixelinstudio.belajarrecyclerview.services

import org.pixelinstudio.belajarrecyclerview.data.DataUser
import retrofit2.Call
import retrofit2.http.GET

interface Api {
    @GET("posts")
    fun getPosts(): Call<ArrayList<DataUser>>
}