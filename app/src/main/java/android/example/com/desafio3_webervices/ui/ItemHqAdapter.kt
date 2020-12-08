package android.example.com.desafio3_webervices.ui

import android.content.Context
import android.content.Intent
import android.example.com.desafio3_webervices.R
import android.example.com.desafio3_webervices.entities.Hq
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class HqAdapter (val listHq: ArrayList<Hq>, val context: Context) : RecyclerView.Adapter<HqAdapter.HqViewHolder>() {

/*    //var listHq: MutableList<ItemHq> = ArrayList()
    var listHq = ArrayList<String>()
    ////val listHq: List<ItemHq>
   //var listHq = ArrayList<ItemHq>()*/

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): HqViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_hq, parent, false)
        return HqViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: HqViewHolder, position: Int) {
        val currentItem = listHq[position]

        holder.tvIdHq.text = currentItem.issueNumber.toString()
        Picasso.get().load(currentItem.thumbnail.toString())
            .into(holder.ivHq)

        holder.ivHq.setOnClickListener {
            context.startActivity(
                Intent(context, ComicActivity::class.java)
                    .putExtra("hq", currentItem)
            )
        }
    }

    override fun getItemCount(): Int = listHq.size


    inner class HqViewHolder (listView: View) : RecyclerView.ViewHolder(listView) {
        var ivHq: ImageView = itemView.findViewById(R.id.iv_hq)
        var tvIdHq: TextView = itemView.findViewById(R.id.tv_id_hq)
    }
}






