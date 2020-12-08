package android.example.com.desafio3_webervices.ui

import android.content.Intent
import android.example.com.desafio3_webervices.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        setSupportActionBar(findViewById(R.id.toolBarRegister))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        bSave.setOnClickListener {
            openHomeActivity()
        }
    }

    private fun openHomeActivity() {
        var intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)

    }
}
