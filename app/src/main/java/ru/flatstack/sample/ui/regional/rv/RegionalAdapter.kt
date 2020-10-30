package com.v12ten.mvp_rentcycle.ui.trips.rv

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ru.flatstack.sample.R
import ru.flatstack.sample.entities.RegOperator

open class RegionalAdapter(
    private val onItemClick: ((items: List<RegOperator>?, position: Int) -> Unit)? = null
) : RecyclerView.Adapter<RegionalHolder>() {

    var items: List<RegOperator>? = null

    override fun getItemViewType(position: Int): Int {
        return if (position == 0) 0 else 1
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RegionalHolder {
        val v =
            LayoutInflater.from(parent.context).inflate(R.layout.item_regional, parent, false)

        return object : RegionalHolder(v) {
            override fun onClick(v: View?) {
                onItemClick?.invoke(items, adapterPosition)
            }
        }
    }

    override fun getItemCount(): Int {
        return 50
    }

    override fun onBindViewHolder(holder: RegionalHolder, position: Int) {}
}