package com.projectclone.spotifyclone.data.remote

import com.google.firebase.firestore.FirebaseFirestore
import com.projectclone.spotifyclone.data.entities.Song
import com.projectclone.spotifyclone.others.Constants.SONG_COLLECTION
import kotlinx.coroutines.tasks.await

class MusicDataBase {

    private val firebase = FirebaseFirestore.getInstance()
    private val songCollection = firebase.collection(SONG_COLLECTION)

    suspend fun getAllSongs(): List<Song>{
        return try {
            songCollection.get()
                .await()
                .toObjects(Song::class.java)
        }catch (e:Exception){
            emptyList()
        }
    }
}