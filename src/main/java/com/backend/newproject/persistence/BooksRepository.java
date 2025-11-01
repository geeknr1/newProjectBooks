package com.backend.newproject.persistence;

import com.backend.newproject.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface BooksRepository extends JpaRepository<Book, Long> {
    public ArrayList<Book> getBooks();
    public Book getBook(Long id);
    public ArrayList<Book> getBooksByAuthor(String author);
    public ArrayList<Book> getBooksByTitle(String title);
    public ArrayList<Book> getBooksByYear(int year);
    public ArrayList<Book> getBooksByPage(int page);
    public ArrayList<Book> getBooksByYearAndPage(int year, int page);

    public static Book saveBook(Book book) {
        return null;
    }
}
