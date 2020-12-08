package android.example.com.desafio3_webervices.ui

import android.example.com.desafio3_webervices.entities.Hq
import android.example.com.desafio3_webervices.services.Repository
import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.coroutines.launch

class HomeViewModel(val repository: Repository) : ViewModel() {

    val listHqs = MutableLiveData<ArrayList<Hq>>()

    fun popListHqs() {
        viewModelScope.launch {

            val data = repository.getHqs(
                1,
                10,
                "1",
                "92a920e201edc6de922ef3922b1d6f03",
                "5258e22859de0f20b3f043e9ef617ba5"
            )
            val results = data.get("data").asJsonObject.get("results")
            val hq = Gson().fromJson(
                results,
                object : TypeToken<List<Hq>>() {}.type
            ) as ArrayList<Hq>
            listHqs.value = hq

            hq.forEach {
                Log.i("MainViewModelHq", it.title).toString()
                Log.i("MainViewModelHq", it.thumbnail.toString())
            }
        }
    }
}




