package org.pixelinstudio.belajarrecyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.pixelinstudio.belajarrecyclerview.R
import org.pixelinstudio.belajarrecyclerview.data.DataUser

class RetrofitAdapter(private val list: ArrayList<DataUser>) : RecyclerView.Adapter<RetrofitAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RetrofitAdapter.ViewHolder {
        // fungsi untuk menampilkan wadah berisi data yang akan ditampilkan oleh recycler view pada saat aplikasi berjalan

        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_list_users, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: RetrofitAdapter.ViewHolder, position: Int) = holder.bind(list[position])
    // fungsi yang bertugas untuk menggabungkan data yang ada pada saat class ViewHolder


    override fun getItemCount(): Int = list.size
    // fungsi untuk menghitung banyaknya data yang akan diolah



    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        //        deklarasikan terlebih dahulu vairable yang berisikan resource id yang dituju
        var textuserId: TextView = itemView.findViewById(R.id.text_userid)
        var textJudul: TextView = itemView.findViewById(R.id.text_judul)
        var textBody: TextView = itemView.findViewById(R.id.text_body)

        //        tambahkan bind untuk mengisi seluruh datanya disini
        fun bind(dataUsers: DataUser) {

            textuserId.text = dataUsers.id.toString()
            textJudul.text = dataUsers.title
            textBody.text = dataUsers.body
        }
    }
}