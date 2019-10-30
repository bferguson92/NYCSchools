package com.example.nycschools.presenter

import com.example.nycschools.factory.SchoolFactory
import com.example.nycschools.model.SchoolList
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class SchoolPresenter (private val view: SchoolContract.View) : SchoolContract.Presenter {

    private val schoolFactory = SchoolFactory()

    override fun getSchools(){
        schoolFactory.getSchools().enqueue(object : Callback<List<SchoolList>> {
            override fun onFailure(call: Call<List<SchoolList>>, t: Throwable) {

            }

            override fun onResponse(
                call: Call<List<SchoolList>>,
                response: Response<List<SchoolList>>
            ) {
                response.body()?.let {schools->
                    view.displaySchools(schools)
                }
            }
        })
    }
}