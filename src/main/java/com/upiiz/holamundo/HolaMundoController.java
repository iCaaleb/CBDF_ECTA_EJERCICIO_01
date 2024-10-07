package com.upiiz.holamundo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Anotaciones - Decoraciones
@RestController
public class HolaMundoController {

    @GetMapping("/holamundo")
    public String holaMundo() {
        return "Hola mundo de las API con el método GET";
    }

    @GetMapping("/holamundo2")
    public String holaMundo2() {
        return "Hola al mundo de las APIS 2 con el método GET";
    }
}
