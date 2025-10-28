package com.backend.newproject;

import java.util.ArrayList;

public interface BooksController {
    public ArrayList<Book> getBooks();
    public Book getBookDetails(int bookId);
    public void postBook(Book book);
    public void putBook(Book book, int bookId);
    public void deleteBook(Book book, int bookId);
}
