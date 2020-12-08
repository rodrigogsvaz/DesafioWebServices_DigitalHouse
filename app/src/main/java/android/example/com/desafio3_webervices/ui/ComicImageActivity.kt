package android.example.com.desafio3_webervices.ui

import android.example.com.desafio3_webervices.R
import android.example.com.desafio3_webervices.entities.Hq
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_comic.*
import kotlinx.android.synthetic.main.activity_comic.iv_hq_cover
import kotlinx.android.synthetic.main.activity_comic_image.*

class ComicImageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comic_image)

        val hq = intent.getSerializableExtra("hq") as Hq

        Picasso.get().load(hq.thumbnail.toString())
            .into(iv_comic_image)



    }
}