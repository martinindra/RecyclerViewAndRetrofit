package org.pixelinstudio.belajarrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import org.pixelinstudio.belajarrecyclerview.adapter.MangaAdapter
import org.pixelinstudio.belajarrecyclerview.adapter.RetrofitAdapter
import org.pixelinstudio.belajarrecyclerview.data.DataUser
import org.pixelinstudio.belajarrecyclerview.model.Manga
import org.pixelinstudio.belajarrecyclerview.services.RetrofitClient
import org.w3c.dom.Text
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Retrofit : AppCompatActivity() {

    private var list: ArrayList<DataUser> = arrayListOf()
    private lateinit var dataUserAdapter: RetrofitAdapter
    private lateinit var rvUsers: RecyclerView

    private lateinit var textUserId : TextView
    private lateinit var textJudul : TextView
    private lateinit var textBody : TextView

//    private var title: String = "List Manga"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_retrofit)

        rvUsers = findViewById(R.id.recyclerview_retrofit)
        rvUsers.setHasFixedSize(true)
        rvUsers.layoutManager = LinearLayoutManager(this@Retrofit)

        showUsers()
    }

    private fun showUsers() {
        RetrofitClient.instance.getPosts().enqueue(object : Callback<ArrayList<DataUser>>{
            override fun onResponse(
                call: Call<ArrayList<DataUser>>,
                response: Response<ArrayList<DataUser>>
            ) {
                val responseCode = response.code().toString()
                response.body()?.let { list.addAll(it) }
                val adapter = RetrofitAdapter(list)
                rvUsers.adapter = adapter
            }

            override fun onFailure(call: Call<ArrayList<DataUser>>, t: Throwable) {

            }
        })
    }
}