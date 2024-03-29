package com.example.nycschools.di

import com.example.nycschools.presenter.SchoolPresenter
import dagger.Component
import javax.inject.Singleton


@Component(modules = [SchoolModule::class])
    interface SchoolComponent {
        fun inject(schoolPresenter: SchoolPresenter)
    }
