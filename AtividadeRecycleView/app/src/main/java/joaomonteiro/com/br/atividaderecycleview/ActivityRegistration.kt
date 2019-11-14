package joaomonteiro.com.br.atividaderecycleview

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class ActivityRegistration : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrarion)


        val button1 = findViewById<Button>(R.id.Activity_main_registration_button_1)
        button1.setOnClickListener {

            val intent = Intent(this, MainActivity::class.java)

            startActivity(intent)

        }

        val editName = findViewById<EditText>(R.id.activity_registration_editText_name)
        val editCpf = findViewById<EditText>(R.id.activity_registration_editText_Cpf)
        val editLogin = findViewById<EditText>(R.id.activity_registration_editText_login)
        val editPassword = findViewById<EditText>(R.id.activity_registration_editText_password)


        val button2 = findViewById<Button>(R.id.Activity_main_registration_button_2)
        button2.setOnClickListener {

         val name = editName.text.toString()
         val cpf = editCpf.text.toString()
         val login = editLogin.text.toString()
         val password = editPassword.text.toString()

         val intent = Intent(this, ActivityPresentRegistration::class.java)


            intent.putExtra("name", name)
            intent.putExtra("cpf", cpf)
            intent.putExtra("login", login)
            intent.putExtra("password", password)

            setResult(Activity.RESULT_OK, intent)

            startActivity (intent)

        }
    }
}
