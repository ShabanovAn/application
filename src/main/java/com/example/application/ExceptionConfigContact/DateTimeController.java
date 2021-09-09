package com.example.application.ExceptionConfigContact;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@RestController
public class DateTimeController {

    @PostMapping("/date")
    public void date(@DateTimeFormat(pattern = "dd.MM.yyyy")@RequestParam("date") Date date) {
        // ...
    }

    @PostMapping("/localdate")
    public void localDate(@RequestParam("localDate") LocalDate localDate) {
        // ...
    }

    @PostMapping("/localdatetime")
    public void dateTime(@RequestParam("localDateTime") LocalDateTime localDateTime) {
        // ...
    }
}