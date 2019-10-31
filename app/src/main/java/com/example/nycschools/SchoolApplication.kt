package com.example.nycschools

import android.app.Application
import com.example.nycschools.di.DaggerSchoolComponent
import com.example.nycschools.di.SchoolComponent
import com.example.nycschools.util.ApplicationData

class SchoolApplication : Application() {

    var name = "Public string"

    override fun onCreate() {
        super.onCreate()
         ApplicationData.daggerSchoolComponent = DaggerSchoolComponent.create()
    }
}