package com.example.nycschools.presenter

import com.example.nycschools.model.SchoolResponse
import com.example.nycschools.model.ScoreResponse

interface SchoolContract {
    interface Presenter {
        fun getSchools()
    }


    interface View  {
        fun displaySchools(schools: List<ScoreResponse>)
    }
}