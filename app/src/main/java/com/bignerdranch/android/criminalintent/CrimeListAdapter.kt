package com.bignerdranch.android.criminalintent

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bignerdranch.android.criminalintent.databinding.ListItemCrimeBinding

class CrimeHolder( private val binding: ListItemCrimeBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(crime: Crime, onCrimeClicked: () -> Unit) {
        binding.crimeTitle.text = crime.title
        binding.crimeDate.text = crime.date.toString()

        binding.root.setOnClickListener{
            onCrimeClicked
        }





    }

    class CrimeListAdapter(private var crimes: List<Crime>, private val onCrimeClicked:() -> Unit) : RecyclerView.Adapter<CrimeHolder>() {
        override fun onCreateViewHolder(
            parent: ViewGroup,
            viewType: Int
        ): CrimeHolder {
            val inflater = LayoutInflater.from(parent.context)
            val binding = ListItemCrimeBinding.inflate(inflater, parent, false)
            return CrimeHolder(binding)
        }

        override fun onBindViewHolder(
            holder: CrimeHolder,
            position: Int
        ) {
            val crime = crimes[position]

            holder.apply {
                holder.bind(crime,onCrimeClicked )
            }

        }

        override fun getItemCount(): Int {
            return crimes.size
        }

    }
}