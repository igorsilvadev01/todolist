package br.com.igorsilvadev01.todolist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/PrimeiraRota")

//http:localhost:8080/PrimeiraRota -----

public class MinhaPrimeiraController {
@GetMapping("/")
    public String PrimeiraMensagem() {
        return "Funcionou";
    }
}
