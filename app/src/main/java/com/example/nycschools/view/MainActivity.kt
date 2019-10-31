package com.example.nycschools.view

import android.content.Intent
import android.icu.text.IDNA
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.nycschools.R
import com.example.nycschools.SchoolApplication
import com.example.nycschools.adapter.SchoolAdapter
import com.example.nycschools.model.School
import com.example.nycschools.model.SchoolResponse
import com.example.nycschools.model.ScoreResponse
import com.example.nycschools.presenter.SchoolContract
import com.example.nycschools.presenter.SchoolPresenter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), SchoolContract.View, SchoolAdapter.SchoolAdapterDelegate {

    private val schoolPresenter = SchoolPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        schoolPresenter.getSchools()
    }

    override fun displaySchools(schools: List<ScoreResponse>) {
        recycler_view_schools.adapter = SchoolAdapter(schools, this)
        recycler_view_schools.layoutManager = LinearLayoutManager(this)
    }

    override fun getScores(school: School) {
        val intent = Intent(this, InfoActivity::class.java)
        intent.putExtra("school", school)
        startActivity(intent)
    }

}
