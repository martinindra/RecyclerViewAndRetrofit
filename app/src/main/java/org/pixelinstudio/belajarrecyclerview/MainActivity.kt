package org.pixelinstudio.belajarrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import org.pixelinstudio.belajarrecyclerview.adapter.MangaAdapter
import org.pixelinstudio.belajarrecyclerview.data.MangaData
import org.pixelinstudio.belajarrecyclerview.model.Manga

class MainActivity : AppCompatActivity() {
    private var list: ArrayList<Manga> = arrayListOf()
    private lateinit var mangaAdapter: MangaAdapter
    private lateinit var rvManga: RecyclerView
    private var title: String = "List Manga"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.title = title

        rvManga = findViewById(R.id.recyclerview_manga)
        showRecyclerView()
    }

    private fun showRecyclerView() {
        list.addAll(MangaData.listData)
        mangaAdapter = MangaAdapter(list, this@MainActivity)

        rvManga.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = mangaAdapter
            setHasFixedSize(true)

        }
    }
}