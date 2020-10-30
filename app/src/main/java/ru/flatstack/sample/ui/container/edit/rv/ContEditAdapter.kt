package com.v12ten.mvp_rentcycle.ui.trips.rv

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ru.flatstack.sample.R
import ru.flatstack.sample.entities.WhMedia

open class ContEditAdapter(
    private val onItemClick: ((items: List<WhMedia>?, position: Int) -> Unit)? = null
) : RecyclerView.Adapter<ContEditHolder>() {

    var items: List<WhMedia>? = null

    override fun getItemViewType(position: Int): Int {
        return if (position == 0) 0 else 1
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContEditHolder {
        var v = LayoutInflater.from(parent.context).inflate(R.layout.item_file, parent, false)
        if (viewType == 0) {
            v = LayoutInflater.from(parent.context).inflate(R.layout.item_camera, parent, false)
        }

        return object : ContEditHolder(v) {
            override fun onClick(v: View?) {
                onItemClick?.invoke(items, adapterPosition)
            }
        }
    }

    override fun getItemCount(): Int {
        return 50
    }

    override fun onBindViewHolder(holder: ContEditHolder, position: Int) {}
}