package com.example.topgames

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class MyAdapter (val topGamesItens: ArrayList<TopGamesData>):
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
        inner class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
            // definindo atributos e tipos
            var gamesImage: ImageView
            var gamesTitle: TextView

            init {
                gamesImage = itemView.findViewById(R.id.cardViewImg)
                gamesTitle = itemView.findViewById(R.id.cardviewText)

                itemView.setOnClickListener{
                    Toast.makeText(
                        itemView.context,
                        "Voce escolheu: ${topGamesItens[adapterPosition].txt}",
                        Toast.LENGTH_LONG,
                    ).show()
                }
            }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        // criando inflater para suporte de visualizacao
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.cad_item,parent,false)
        return  MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return topGamesItens.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        // vinculando ma view com os dados corretos
        holder.gamesImage.setImageResource(topGamesItens[position].img)
        holder.gamesTitle.text = topGamesItens[position].txt
    }
}
