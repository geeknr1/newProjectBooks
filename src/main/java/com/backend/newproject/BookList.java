package com.backend.newproject;
import java.util.ArrayList;

public class BookList implements BooksController{
    private ArrayList<Book> books;
    public BookList() {}
    public static Logger log;

    @Override
    public ArrayList<Book> getBooks(){
        return books;
    }

    @Override
    public Book getBookDetails(int bookId) {
        return books.get(0);
    }

    @Override
    public void postBook(Book book) {
        System.out.println(book);
        log = Logger.getInstance();
    }

    @Override
    public void putBook(Book book, int bookId) {
        System.out.println("Replacing book: " + book);
        log = Logger.getInstance();

    }

    @Override
    public void deleteBook(Book book, int bookId) {
        System.out.println("Deleting book: " + bookId);
        log = Logger.getInstance();

    }
}
