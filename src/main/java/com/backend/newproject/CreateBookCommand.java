package com.backend.newproject;
import com.backend.newproject.persistence.BooksRepository;

public class CreateBookCommand implements Command {
    private Book book;
    public CreateBookCommand(Book book){
        this.book = book;
    }

    public Book getBook(){
        return this.book;
    }

    public void saveBookToDatabase(){
        this.book = BooksRepository.saveBook(book);
    }

    @Override
    public void execute() {}
}
