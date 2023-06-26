package com.proyecto.Booking.controller;

import com.proyecto.Booking.entities.UserBook;
import com.proyecto.Booking.service.UserBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/userbook")
public class UserBookController {

    @Autowired
    UserBookService userBookService;

    @PostMapping("/crear")
    public void crear(@RequestBody UserBook userBook){
        userBookService.guardarBook(userBook);
    }

    @GetMapping("traertodoslosbook")
    public ResponseEntity<List<UserBook>> traertodos(){
        return ResponseEntity.ok(userBookService.retornarTodosLosBooks());
    }


}
