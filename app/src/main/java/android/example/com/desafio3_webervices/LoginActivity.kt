package android.example.com.desafio3_webervices

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        bCreateAccount.setOnClickListener {
            openRegisterActivity()
        }

        bLogin.setOnClickListener {
            openHomeActivity()
        }
    }

    private fun openRegisterActivity() {
        var intent = Intent(this, RegisterActivity::class.java)
        startActivity(intent)
    }

    private fun openHomeActivity() {
        var intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
    }

}







