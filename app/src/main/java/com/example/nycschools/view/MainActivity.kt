package com.example.nycschools.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.nycschools.R
import com.example.nycschools.adapter.SchoolAdapter
import com.example.nycschools.model.SchoolList
import com.example.nycschools.presenter.SchoolContract
import com.example.nycschools.presenter.SchoolPresenter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), SchoolContract.View {

    private val schoolPresenter = SchoolPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        schoolPresenter.getSchools()

    }

    override fun displaySchools(schools: List<SchoolList>) {
        recycler_view_schools.adapter = SchoolAdapter(schools)
        recycler_view_schools.layoutManager = LinearLayoutManager(this)
    }
}
