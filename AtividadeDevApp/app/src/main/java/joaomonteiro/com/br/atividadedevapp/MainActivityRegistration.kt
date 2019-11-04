package joaomonteiro.com.br.atividadedevapp

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivityRegistration : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrarion)


        val button1 = findViewById<Button>(R.id.Activity_main_registration_button_1)
        button1.setOnClickListener {

            val intent = Intent(this, MainActivity::class.java)

            startActivity(intent)

        }

        val editName = findViewById<EditText>(R.id.activity_main_registration_editText_name)
        val editCpf = findViewById<EditText>(R.id.activity_main_registration_editCpf)

        val button2 = findViewById<Button>(R.id.Activity_main_registration_button_2)
        button2.setOnClickListener {

         val name = editName.text.toString()
         val cpf = editCpf.text.toString()
         val intent = Intent(this, MainActivityPresentRegistration::class.java)


            intent.putExtra("name", name)
            intent.putExtra("cpf", cpf)

            setResult(Activity.RESULT_OK, intent)

            startActivity (intent)

        }
    }
}
