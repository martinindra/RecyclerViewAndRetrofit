package org.pixelinstudio.belajarrecyclerview.data

import org.pixelinstudio.belajarrecyclerview.R
import org.pixelinstudio.belajarrecyclerview.model.Manga

object MangaData {
    private val image: Array<Int> =
        arrayOf(
            R.drawable.domestickanojo,
            R.drawable.kanojookarishimaru,
            R.drawable.realgirl,
            R.drawable.promisedneverland,
            R.drawable.onepiece,
            R.drawable.yahariore,
            R.drawable.uzakichan,
            R.drawable.rascaldoesnot,
            R.drawable.kakushigoto,
            R.drawable.singyesterday
        )

    private val title: Array<String> =
        arrayOf(
            "Domestic na Kanojo",
            "Kanojo, Okarishimasu",
            "Real Girl",
            "The Promise Neverland",
            "One Piece",
            "Yahari Ore no Seishun Love Come wa Machigatteiru",
            "Uzaki-chan Wants to Hang Out!",
            "Rascal Does Not Dream of Bunny Girl Senpai",
            "Kakushigoto",
            "Sing Yesterday for Me"
        )

    private val author: Array<String> =
        arrayOf(
            "Kei Sasuga",
            "Reiji Miyajima",
            "Mao Nanami",
            "Kaiu Shirai",
            "Eiichiro Oda",
            "Wataru Watari",
            "Take",
            "Hajime Kamoshida",
            "Kōji Kumeta",
            "Kei Toume"
        )

    private val genre: Array<String> =
        arrayOf(
            "Romance",
            "Romantic comedy",
            "Romantic comedy",
            "Science fiction",
            "Adventure",
            "Slice of Life",
            "Comedy",
            "Supernatural",
            "Slice of Life",
            "Coming of Age"
        )

    val listData: ArrayList<Manga>
        get() {
            val list : ArrayList<Manga> = arrayListOf<Manga>()
            for (i in image.indices){
                val manga = Manga() //variable manga untuk menyimpan object dari data class manga tadi yang akan di isi
                manga.coverImage = image[i] //data property coverImage milik manga dengan dta yang dimiliki object
                manga.title = title[i] //data property title manga di isi dengan data title object
                manga.author = author[i] //data property author manga di isi dengan data milik object
                manga.genre = genre[i] // data genre manga di isi dengan data milik object
                list.add(manga) // memasukkan data yang ditambahkan dari object ke dalam manga sesuai looping
            }
            return list // mengembalikan data ke variable list yang ada di atas
        }

}