package com.v12ten.mvp_rentcycle.ui.trips.rv

import android.view.View
import androidx.recyclerview.widget.RecyclerView

open class RegionalHolder(
    itemView: View
) : RecyclerView.ViewHolder(itemView), View.OnClickListener {

    init {
        itemView.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        //for override
    }
}