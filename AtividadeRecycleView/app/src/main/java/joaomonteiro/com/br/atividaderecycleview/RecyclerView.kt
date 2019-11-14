package joaomonteiro.com.br.atividaderecycleview

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton


class RecyclerView : AppCompatActivity() {

    private lateinit var recycleView: RecyclerView
    private lateinit var adapter: MyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_recicler_view)
        recycleView = findViewById<RecyclerView>(R.id.rec_view)
        recycleView.layoutManager = LinearLayoutManager(this)
        adapter = MyAdapter(mutableListOf())
        recycleView.adapter = adapter

        val presentation = findViewById<TextView>(R.id.recycler_view_text_view)

        val hello = getString(R.string.hello)

        presentation.text = "$hello  ${intent.getStringExtra("login")}"

        val fabButton = findViewById<FloatingActionButton>(R.id.floatingActionButton)
        fabButton.setOnClickListener {

            customDialogAdd(this)

        }

    }

    private fun customDialogAdd(activity: Activity) {
        AlertDialog.Builder(activity).apply {
            val dialogView = activity.layoutInflater.inflate(R.layout.layout_dialog_add, null)
            val customDialogText = dialogView.findViewById<EditText>(R.id.custom_add_entry)

            setView(dialogView)

            setTitle(R.string.custom_tittle)
            setMessage(R.string.custom_message)
            setPositiveButton(R.string.custom_dialog_save) { _, _ ->

                val dialogText = customDialogText.text.toString()

                val user = User(dialogText)
                adapter.addUser(user)

             }

            setNegativeButton(R.string.custom_dialog_cancel) { _, _ ->

            }
        }.create().show()
    }
}
