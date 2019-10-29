package com.example.nycschools.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.nycschools.R
import com.example.nycschools.model.SchoolList
import javax.inject.Inject

class SchoolAdapter (private val schools: List<SchoolList>) : RecyclerView.Adapter<SchoolAdapter.CustomViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        return CustomViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.school_item, parent, false))
    }

    override fun getItemCount(): Int {
        return schools.size
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.apply {
            schoolName.text = schools[position].schoolName
        }
    }

    class CustomViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val schoolName: TextView = view.findViewById(R.id.text_view_name)
    }
}
