package android.example.com.desafio3_webervices.ui

import android.content.Intent
import android.example.com.desafio3_webervices.R
import android.example.com.desafio3_webervices.entities.Hq
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat.startActivity
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_comic.*

class ComicActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comic)

        val hq = intent.getSerializableExtra("hq") as Hq

        tv_comic_title.text = hq.title
        tv_comic_description.text = hq.description
        tv_comic_pages.text = hq.pageCount.toString()
        //tv_comic_publishingDate.text = hq.date.toString()
        //tv_comic_price.text = hq.price.toString()

        Picasso.get().load(hq.thumbnail.toString())
            .into(iv_hq_comic)

        Picasso.get().load(hq.thumbnail.toString())
            .into(iv_hq_cover)

        iv_hq_comic.setOnClickListener {
            var intent = Intent(application, ComicImageActivity::class.java)
            intent.putExtra("hq", hq)
            startActivity(intent)

        }

    }
}