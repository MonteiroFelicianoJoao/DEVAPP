package joaomonteiro.com.br.atividaderecycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ActivityPresentRegistration : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_present_registration)

        val hello: String = getString(R.string.hello)
        val yourCpf: String = getString(R.string.your_cpf)
        val yourLogin: String = getString(R.string.your_login)
        val yourPassword: String = getString(R.string.your_password)
        val textOut = findViewById<TextView>(R.id.present_registration)

        textOut.text = "${hello} ${intent.getStringExtra("name")} \n\n" + "${yourCpf} ${intent.getStringExtra(
            "cpf")} \n\n" + "$yourLogin ${intent.getStringExtra("login")} \n\n" + "${yourPassword} ${intent.getStringExtra("password")}"
    }
}
