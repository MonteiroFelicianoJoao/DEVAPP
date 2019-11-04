package joaomonteiro.com.br.atividadedevapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 = findViewById<Button>(R.id.main_button)
        button1.setOnClickListener {

            val intent = Intent(this, MainActivityRegistration::class.java)

            startActivity(intent)
        }

        val button2 = findViewById<Button>(R.id.main_button2)
        button2.setOnClickListener {

            val intent = Intent(this, MainActivityLogin::class.java)

            startActivity(intent)
        }

    }
}
