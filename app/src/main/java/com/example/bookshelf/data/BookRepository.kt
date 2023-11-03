package com.example.bookshelf.data

import com.example.bookshelf.model.Book
import com.example.bookshelf.network.BookService

interface BookRepository{
    suspend fun getBooks(): List<Book>
}
class NetworkBookRepository(
    private val bookService: BookService
) : BookRepository {
    override suspend fun getBooks(): List<Book> = bookService.getBooks().items
}