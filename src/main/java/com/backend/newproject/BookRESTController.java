package com.backend.newproject;
import com.backend.newproject.persistence.BooksRepository;
import org.springframework.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/app/books")
public class BookRESTController {
    private BooksRepository booksRepository;


    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks() {
        List<Book> books = booksRepository.findAll();
        return ResponseEntity.ok(books);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable Long id) {
        Optional<Book> book = booksRepository.findById(id);
        return book.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteBookById(@PathVariable Long id) {
        if (booksRepository.existsById(id)) {
            booksRepository.deleteById(id);
            return ResponseEntity.ok().build();
        }
        else
            return ResponseEntity.notFound().build();
    }

    @PutMapping("{/id}")
    public ResponseEntity<Book> updateBookById(@RequestBody Book book, @PathVariable Long id) {
        Optional<Book> bookOptional = booksRepository.findById(id);
        if (bookOptional.isPresent()) {
            Book bookUpdated = bookOptional.get();
            bookUpdated.setTitle(book.getTitle());
        }
        return ResponseEntity.ok(booksRepository.save(book));
    }
}
