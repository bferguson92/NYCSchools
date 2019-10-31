package com.example.nycschools.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class School(val name: String,
             val readingScore: String,
             val mathScore: String,
             val writingScore: String) : Parcelable