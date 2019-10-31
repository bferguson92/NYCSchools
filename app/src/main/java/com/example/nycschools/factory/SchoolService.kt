package com.example.nycschools.factory

import com.example.nycschools.model.SchoolResponse
import com.example.nycschools.model.ScoreResponse
import retrofit2.Call
import retrofit2.http.GET

interface SchoolService {

    @GET("resource/s3k6-pzi2.json")
    fun getSchoolRepos() : Call<List<SchoolResponse>>


    @GET("resource/f9bf-2cp4.json")
    fun getScores(): Call<List<ScoreResponse>>

}