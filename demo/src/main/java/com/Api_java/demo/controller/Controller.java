package com.Api_java.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    //desafio
    @GetMapping ("/hello")
    public String hola(){
        return "Hola mi nombre es Tamara Avalos y esta es mi primera API";
    }

    @PostMapping("/goodbye")
    public String chau() {
        return "Hasta luego!";
    }

    //extras

    @GetMapping("/hello2")
    public String hola2(@RequestParam String nombre) {
        return "Hola! Mi nombre es " + nombre ;
    }

    @GetMapping("/hello3/{nombre}")
    public String hola3(@PathVariable String nombre) {
        return "Hola soy " + nombre ;
    }

    @GetMapping ("/hola")
    public ResponseEntity<String> hola4() {
        return ResponseEntity.status(HttpStatus.OK).body("Hola desde el Response Entity");
    }

}