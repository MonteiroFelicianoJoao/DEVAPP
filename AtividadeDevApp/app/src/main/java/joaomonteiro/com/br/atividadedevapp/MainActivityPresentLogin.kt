package joaomonteiro.com.br.atividadedevapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivityPresentLogin : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_present_login)

        val stringLogin: String = getString(R.string.present_login)
        val stringPassword: String = getString(R.string.password)
        val textOut = findViewById<TextView>(R.id.activity_main_present_text_login)

        textOut.text = " ${stringLogin} ${intent.getStringExtra("login")}, \n" + " ${stringPassword} ${intent.getStringExtra(
            "password")}"
    }
}
