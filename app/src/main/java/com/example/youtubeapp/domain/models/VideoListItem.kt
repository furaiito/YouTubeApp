package com.example.youtubeapp.domain.models

import androidx.room.Embedded
import androidx.room.Relation

class VideoListItem {

    @Embedded
    lateinit var playListItem : PlaylistItem

    @Relation(parentColumn = "id",entityColumn = "playlistId")
    lateinit var videoList : MutableList<PlaylistItem>
}