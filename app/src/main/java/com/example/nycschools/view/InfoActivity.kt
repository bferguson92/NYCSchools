package com.example.nycschools.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.nycschools.R
import com.example.nycschools.model.School
import kotlinx.android.synthetic.main.activity_info.*

class InfoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)
        val school = intent.getParcelableExtra<School>("school")

        textview_school.text = school?.name
        textview_reading_score.text = school?.readingScore
        textview_math_score.text = school?.mathScore
        textview_writing_score.text = school?.writingScore

    }
}
