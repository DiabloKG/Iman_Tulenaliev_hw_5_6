package com.example.iman_tulenaliev_hw_5_6.history

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.iman_tulenaliev_hw_5_6.databinding.ItemHistoryBinding
import com.example.iman_tulenaliev_hw_5_6.remote.LoveModel

class HistoryAdapter() : Adapter<HistoryAdapter.HistoryViewHolder>() {

    private var historyList = arrayListOf<LoveModel>()

    fun addLoveModelFromRoom(list: List<LoveModel>){
        historyList = list as ArrayList<LoveModel>
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HistoryViewHolder {
        return HistoryViewHolder(
            ItemHistoryBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return historyList.size
    }

    override fun onBindViewHolder(holder: HistoryViewHolder, position: Int) {
        holder.bind(historyList[position])
    }

    class HistoryViewHolder(var binding: ItemHistoryBinding) : ViewHolder(binding.root) {

        fun bind(loveModel: LoveModel){
            with(binding){
                tvFirstNameItem.text = loveModel.fname
                tvSecondNameItem.text = loveModel.sname
                tvPercentageItem.text= loveModel.percentage
            }
        }

    }
}