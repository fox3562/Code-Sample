package com.v12ten.mvp_rentcycle.ui.trips.rv

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ru.flatstack.sample.R
import ru.flatstack.sample.entities.Container

open class ContListAdapter(
    private val onItemClick: ((items: List<Container>?, position: Int) -> Unit)? = null
) : RecyclerView.Adapter<ContListHolder>() {

    var items: List<Container>? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContListHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_container, parent, false)

        return object : ContListHolder(v) {
            override fun onClick(v: View?) {
                onItemClick?.invoke(items, adapterPosition)
            }
        }
    }

    override fun getItemCount(): Int {
        return 50
    }

    override fun onBindViewHolder(holder: ContListHolder, position: Int) {}
}