package android.example.com.desafio3_webervices.ui

import android.content.Intent
import android.example.com.desafio3_webervices.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    val scope = CoroutineScope(Dispatchers.Main)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        scope.launch {
            delay(3000)
            val intent = Intent(application, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}