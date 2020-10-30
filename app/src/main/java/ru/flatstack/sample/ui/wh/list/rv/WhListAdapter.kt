package com.v12ten.mvp_rentcycle.ui.trips.rv

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_wh.view.*
import ru.flatstack.sample.R
import ru.flatstack.sample.entities.SimpleWh

open class WhListAdapter(
    private val onItemClick: ((items: List<SimpleWh>, position: Int) -> Unit)? = null
) : RecyclerView.Adapter<WhListHolder>() {

    var items: List<SimpleWh>? = null

    fun setList(list: List<SimpleWh>) {
        items = list
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WhListHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_wh, parent, false)
        return object : WhListHolder(v) {
            override fun onClick(v: View?) {
                onItemClick?.invoke(items!!, adapterPosition)
            }
        }
    }

    override fun getItemCount(): Int {
        return if (items != null) items!!.size else 0
    }

    override fun onBindViewHolder(holder: WhListHolder, position: Int) {
        //todo uncomment that later
        //(holder).itemView.itemWhOwnerText.setText(items!![position].owner!!.fullName)
        //(holder).itemView.itemWhAddressText.setText(items!![position].address!!.city)
        (holder).itemView.itemWhDateText.setText(items!![position].latitude.toString())
        (holder).itemView.itemWhBadgeText.setText(items!![position].longitude.toString())
    }
}