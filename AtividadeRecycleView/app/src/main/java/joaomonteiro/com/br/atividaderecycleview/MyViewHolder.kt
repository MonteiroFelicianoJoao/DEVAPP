package joaomonteiro.com.br.atividaderecycleview

import android.view.View
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var title: TextView = itemView.findViewById(R.id.my_view_holder_text_view)
    var delete:ImageButton=itemView.findViewById(R.id.imageButton2)
}

