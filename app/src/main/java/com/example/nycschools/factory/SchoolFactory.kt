package com.example.nycschools.factory

import com.example.nycschools.model.SchoolList
import com.example.nycschools.util.Constants
import dagger.Module
import dagger.Provides
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Inject


class SchoolFactory {

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

     fun getSchools() : Call<List<SchoolList>> {
        return  schoolService.getSchoolRepos()
    }
}