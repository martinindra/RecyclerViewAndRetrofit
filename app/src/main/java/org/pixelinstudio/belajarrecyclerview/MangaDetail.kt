package org.pixelinstudio.belajarrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_manga_detail.*
import org.pixelinstudio.belajarrecyclerview.R
import org.pixelinstudio.belajarrecyclerview.model.Manga
import org.w3c.dom.Text

class MangaDetail : AppCompatActivity() {
    val MANGA : Manga? by lazy {
        intent.getParcelableExtra<Manga>(EXTRA)
    }

    companion object{
        const val EXTRA = "extra"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_manga_detail)

        val imgManga = findViewById<ImageView>(R.id.gambarDetail)
        val judulManga = findViewById<TextView>(R.id.judulDetail)
        val genreManga = findViewById<TextView>(R.id.genreDetail)

        Glide.with(this)
            .load(MANGA?.coverImage)
            .into(imgManga)

        judulManga.text = MANGA?.title
        authorDetail.text = "Author: " + MANGA?.author
        genreManga.text = "Genre: " + MANGA?.genre

        supportActionBar?.title = MANGA?.title
    }
}