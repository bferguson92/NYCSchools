package com.example.nycschools.di

import com.example.nycschools.factory.SchoolFactory
import dagger.Module
import dagger.Provides

@Module
class SchoolModule {
    @Provides
    fun providesSchoolFactory() : SchoolFactory {
        return SchoolFactory()
    }
}