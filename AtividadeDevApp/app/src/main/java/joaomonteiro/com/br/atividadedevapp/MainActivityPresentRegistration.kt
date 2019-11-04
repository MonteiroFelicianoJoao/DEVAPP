package joaomonteiro.com.br.atividadedevapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivityPresentRegistration : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_present_registration)

        val stringHello: String = getString(R.string.hello)
        val stringYourCpf: String = getString(R.string.your_cpf)
        val textOut = findViewById<TextView>(R.id.present_registration)

        textOut.text = " ${stringHello} ${intent.getStringExtra("name")}, \n" + " ${stringYourCpf}: ${intent.getStringExtra(
            "cpf")}"
    }
}
