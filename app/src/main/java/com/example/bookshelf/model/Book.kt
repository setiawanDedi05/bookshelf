package com.example.bookshelf.model

import kotlinx.serialization.Serializable

@Serializable
data class ImageLinks(
    val smallThumbnail: String,
    val thumbnail: String
)
@Serializable
data class VolumeInfo(
    val title: String? = "",
    val author: List<String>? = null,
    val publisher: String = "",
    val publishedDate: String? = "",
    val description: String? = "",
    val pageCount: Int? = 0,
    val categories: List<String>? = null,
    val imageLinks: ImageLinks? = null
)
@Serializable
data class BooksApiResponse(
    val kind: String,
    val totalItems: Int,
    val items: List<Book>
)
@Serializable
data class Book(
    val kind: String,
    val id: String,
    val etag: String,
    val selfLink: String,
    val volumeInfo: VolumeInfo
)
