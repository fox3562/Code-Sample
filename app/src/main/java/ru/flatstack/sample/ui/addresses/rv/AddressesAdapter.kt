package com.v12ten.mvp_rentcycle.ui.trips.rv

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ru.flatstack.sample.R
import ru.flatstack.sample.entities.FiasAddress

open class AddressesAdapter(
    private val onItemClick: ((items: List<FiasAddress>?, position: Int) -> Unit)? = null
) : RecyclerView.Adapter<AddressesHolder>() {

    var items: List<FiasAddress>? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AddressesHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_address, parent, false)

        return object : AddressesHolder(v) {
            override fun onClick(v: View?) {
                onItemClick?.invoke(items, adapterPosition)
            }
        }
    }

    override fun getItemCount(): Int {
        return 50
    }

    override fun onBindViewHolder(holder: AddressesHolder, position: Int) {}
}