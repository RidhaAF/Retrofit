package id.ac.unpas.retrofit

import retrofit2.Call
import retrofit2.http.GET

interface InterfaceAPI {
    @GET("posts")
    fun getPosts(): Call<ArrayList<PostResponse>>
}