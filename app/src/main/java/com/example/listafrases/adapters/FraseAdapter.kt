package com.example.listafrases.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.listafrases.databinding.FraseItemBinding
import com.example.listafrases.models.Frase

class FraseAdapter(val list: List<Frase>) : RecyclerView.Adapter<FraseAdapter.FraseViewHolder>() {

    inner class FraseViewHolder(val binding : FraseItemBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FraseViewHolder {

        val binding = FraseItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
            )

        return FraseViewHolder(binding)
    }

    override fun onBindViewHolder(holder: FraseViewHolder, position: Int) {
        val item = list[position]
        val context = holder.itemView.context
        holder.binding.text.text = context.resources.getString(item.fraseId)

        holder.binding.imageView.setImageResource(item.imageId)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}