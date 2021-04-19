package org.pixelinstudio.belajarrecyclerview.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.util.*

@Parcelize
data class Manga(
    var coverImage: Int = 0,
    var title: String = "",
    var author: String = "",
    var genre : String = ""
):Parcelable

//data class episodes(
//    var idepisodes: Int = 0,
//    var namaEpisode : String = ""
//)
