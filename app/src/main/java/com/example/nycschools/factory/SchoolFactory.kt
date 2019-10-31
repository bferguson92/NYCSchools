package com.example.nycschools.factory

import com.example.nycschools.model.SchoolResponse
import com.example.nycschools.model.ScoreResponse
import com.example.nycschools.util.Constants
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class SchoolFactory {

    //Inject this
    private var schoolService: SchoolService

    init {
        schoolService = createSchoolService(getRetrofitInstance())
    }


    private fun getRetrofitInstance(): Retrofit{
        //Inject using Dagger
        return  Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    private fun createSchoolService(retrofit: Retrofit): SchoolService {
        return retrofit.create(SchoolService::class.java)
    }

     fun getSchools() : Call<List<SchoolResponse>> {
        return  schoolService.getSchoolRepos()
    }

    fun getScores() : Call<List<ScoreResponse>> {
        return schoolService.getScores()
    }
}