package com.projectclone.spotifyclone.data.entities

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Song(
    val mediaId: Int = 0,
    val title: String = "",
    val author: String = "",
    val songURL: String = "",
    val songImageURl: String = ""
):Parcelable{}
