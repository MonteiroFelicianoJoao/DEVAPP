package joaomonteiro.com.br.atividaderecycleview

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class ActivityLogin : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        val button1 = findViewById<Button>(R.id.Activity_login_button_1)
        button1.setOnClickListener {

            val intent = Intent(this, MainActivity::class.java)

            startActivity(intent)

        }

        val editLogin = findViewById<EditText>(R.id.activity_main_login_edit_login)
        val editPassword = findViewById<EditText>(R.id.activity_main_login_edit_password)

        val button2 = findViewById<Button>(R.id.Activity_main_login_button_2)
        button2.setOnClickListener {

            val login = editLogin.text.toString()
            val password = editPassword.text.toString()
            val intent = Intent(this, RecyclerView::class.java)


            intent.putExtra("login", login)
            intent.putExtra("password", password)

            setResult(Activity.RESULT_OK, intent)

            startActivity (intent)

        }
    }
}
