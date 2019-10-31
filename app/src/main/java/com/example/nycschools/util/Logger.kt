package com.example.nycschools.util

import android.util.Log

object Logger {
    val TAG = "LOGGER"
    fun error(throwable: Throwable) {
        Log.e(TAG, throwable.toString())
    }
}