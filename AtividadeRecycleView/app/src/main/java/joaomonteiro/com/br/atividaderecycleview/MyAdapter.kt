package joaomonteiro.com.br.atividaderecycleview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val users:MutableList<User>): RecyclerView.Adapter<MyViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.layout_my_view_holder, parent,false)
        )
    }

    override fun getItemCount(): Int {
        return users.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.title.text = users[position].name
        holder.delete.setOnClickListener {
            users.removeAt(position)
            notifyItemRemoved(position)
            notifyItemRangeChanged(position, users.size)
        }
    }

    fun addUser(user:User){
        users.add(user)
        notifyItemInserted(itemCount)
    }
}