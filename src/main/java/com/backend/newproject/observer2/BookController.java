package com.backend.newproject.observer2;

import com.backend.newproject.Book;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookRepository bookRepository;
    private final AllBooksSubject allBooksSubject;

    public BookController(BookRepository bookRepository, AllBooksSubject allBooksSubject) {
        this.bookRepository = bookRepository;
        this.allBooksSubject = allBooksSubject;
    }

    @PostMapping("/new-request"
    public String newBookRequest(@RequestBody NewBookRequest newBookRequest) {
        allBooksSubject.addNewBookRequest(newBookRequest);
        return "New book request received.";
    }
    )

    @GetMapping

    public List<Book> getAllBooks() {
        return bookRepository.getAllBooks();
    }

    public Book createBook(@RequestBody Book book) {
        bookRepository.addBook(book);
        return book;
    }

}

