package com.example.nycschools.presenter

import com.example.nycschools.model.SchoolList

interface SchoolContract {
    interface Presenter {
        fun getSchools()
    }


    interface View  {
        fun displaySchools(schools: List<SchoolList>)
    }
}