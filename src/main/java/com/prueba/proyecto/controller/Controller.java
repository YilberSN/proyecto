package com.prueba.proyecto.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class Controller {

    @GetMapping("/api")
    public ResponseEntity<?> testApi(){
        return new ResponseEntity<>("Hola mundo spring boot ", HttpStatus.OK);
    }

    @GetMapping("")
    public ResponseEntity<?> message(){
        return new ResponseEntity<>("Welcome page\nHello user!!!", HttpStatus.OK);
    }

    @GetMapping("/endpoint")
    public ResponseEntity<?> endpoint(){
        return new ResponseEntity<>("Endpoint de prueba!!!", HttpStatus.OK);
    }

}
