package com.example.application.SpringValidationRest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@Validated
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/books")
    List<Book> findAll() {
        return bookRepository.findAll();
    }

    @PostMapping("/books")
    @ResponseStatus(HttpStatus.CREATED)
    Book newBook(@Valid @RequestBody Book newBook) {
        return bookRepository.save(newBook);
    }

    @GetMapping("/books/{id}")
    Book getBook(@RequestParam Long id) {
        return bookRepository.findById(id)
                .orElseThrow(() -> new BookNotFoundException("Книга с таким id не существует"));
    }

}
