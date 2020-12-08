package android.example.com.desafio3_webervices.ui

import android.example.com.desafio3_webervices.R
import android.example.com.desafio3_webervices.services.repository
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_home.*


class HomeActivity : AppCompatActivity() {


    val viewModel by viewModels<HomeViewModel> {
        object : ViewModelProvider.Factory {
            override fun <T : ViewModel?> create(modelClass: Class<T>): T {
                return HomeViewModel(repository) as T
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        setSupportActionBar(findViewById(R.id.toolBar_home))

        val recyclerViewHq: RecyclerView = findViewById(R.id.rv_hq)

        recyclerViewHq.layoutManager = GridLayoutManager(this, 3)

        viewModel.listHqs.observe(this) {
            rv_hq.adapter = HqAdapter(it, this)
        }

        //Atualiza dados
        viewModel.popListHqs()
    }


}

