package com.example.nycschools.presenter

import com.example.nycschools.SchoolApplication
import com.example.nycschools.factory.SchoolFactory
import com.example.nycschools.model.SchoolResponse
import com.example.nycschools.model.ScoreResponse
import com.example.nycschools.util.ApplicationData
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class SchoolPresenter @Inject constructor(private val view: SchoolContract.View) : SchoolContract.Presenter {

    @Inject
    lateinit var schoolFactory: SchoolFactory

    init {
        ApplicationData.daggerSchoolComponent?.inject(this)
    }

    override fun getSchools(){
        schoolFactory.getScores().enqueue(object : Callback<List<ScoreResponse>> {
            override fun onFailure(call: Call<List<ScoreResponse>>, t: Throwable) {

            }

            override fun onResponse(
                call: Call<List<ScoreResponse>>,
                response: Response<List<ScoreResponse>>
            ) {
                response.body()?.let {schools->
                    view.displaySchools(schools)
                }
            }
        })
    }
}