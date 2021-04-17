package org.pixelinstudio.belajarrecyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import org.pixelinstudio.belajarrecyclerview.R
import org.pixelinstudio.belajarrecyclerview.model.Manga

class MangaAdapter(private val listManga: ArrayList<Manga>) : RecyclerView.Adapter<MangaAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MangaAdapter.ViewHolder {
        // fungsi untuk menampilkan wadah berisi data yang akan ditampilkan oleh recycler view pada saat aplikasi berjalan

        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_list_manga, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: MangaAdapter.ViewHolder, position: Int) = holder.bind(listManga[position])
        // fungsi yang bertugas untuk menggabungkan data yang ada pada saat class ViewHolder


    override fun getItemCount(): Int = listManga.size
        // fungsi untuk menghitung banyaknya data yang akan diolah



    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
//        deklarasikan terlebih dahulu vairable yang berisikan resource id yang dituju
        var textTitle: TextView = itemView.findViewById(R.id.text_title)
        var textAuthor: TextView = itemView.findViewById(R.id.text_author)
        var textGenre: TextView = itemView.findViewById(R.id.text_genre)
        var imgPhoto: ImageView = itemView.findViewById(R.id.image_manga)

//        tambahkan bind untuk mengisi seluruh datanya disini
        fun bind(manga: Manga) {
            Glide.with(itemView.context)
                .load(manga.coverImage)
                .apply(RequestOptions().override(90, 110))
                .into(imgPhoto)

            textTitle.text = manga.title
            textAuthor.text = manga.author
            textGenre.text = manga.genre
        }
    }
}