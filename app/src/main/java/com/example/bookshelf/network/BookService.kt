package com.example.bookshelf.network

import com.example.bookshelf.model.BooksApiResponse
import retrofit2.http.GET

interface BookService {
    @GET("volumes?q=jazz+history")
    suspend fun getBooks(): BooksApiResponse
}