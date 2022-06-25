package com.example.retrofitexample

import retrofit2.http.GET
import retrofit2.http.Query

//https://newsapi.org/v2/top-headlines?country=in&apiKey=82c70d391a2d4299b5ff965f7f3746e1

const val BASE_URL = "https://newsapi.org"
const val API_KEY = "82c70d391a2d4299b5ff965f7f3746e1"
interface NewsService {

    @GET("v2/top-headlines?apiKey=$API_KEY")
    fun getHeadlines(@Query("country")country: String, @Query("page")page: Int): Class<News>
}

object NewsService{
    
}