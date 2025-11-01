package com.backend.newproject;
import com.backend.newproject.persistence.BooksRepository;
import java.util.ArrayList;

public class CreateBookCommand implements Command {
    private Book book;
    public CreateBookCommand(Book book){
        this.book = book;
    }

    public Book getBook(){
        return this.book;
    }

    public Book saveBookToDatabase(){
        this.book = BooksRepository.saveBook(book);
        return book;
    }

    public Book getAll(){
        return null;
    }

    public Book getBookById(int bookId){
        return null;
    }

    public void deleteBookById(int bookId){
        System.out.println("Book deleted");
    }

    public void updateBookById(int bookId, Book book){
        System.out.println("Book updated");
    }

    @Override
    public void execute() {}
}
