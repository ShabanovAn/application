package com.example.application.ExceptionConfigContact;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class ContactController {
    private ContactRepository contactRepository;


    @PostMapping("/contact")
    public Contact getContact(@RequestBody Contact contact) {
        return contact;
    }

    @GetMapping("/exception")
    public Contact getException() {
        throw new ContactException("Hello this new Exception");
    }

}
