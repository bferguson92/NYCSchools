package com.example.nycschools.factory

import com.example.nycschools.model.SchoolList
import retrofit2.Call
import retrofit2.http.GET

interface SchoolService {

    @GET("resource/s3k6-pzi2.json")
    fun getSchoolRepos() : Call<List<SchoolList>>

}