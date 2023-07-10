package com.example.demo;

import java.lang.String;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping(path="/")
public class Controlador{

    @GetMapping(path="/")
    public String home(){
        return "SM75716675 - Arnaldo Reynaldo Garcia Tito";
    }

    @GetMapping(path="/idat/codigo")
    public String codigo(){
        return "SM75716675";
    }

    @GetMapping(path="/idat/nombre-completo")
    public String nombre(){
        return "Arnaldo Reynaldo Garcia Tito";
    }
}