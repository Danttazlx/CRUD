package com.example.Crud.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("test")
@RestController
public class Controller {

    @GetMapping
    public String test(){
        return "Test API --------------------";
    }

    @PostMapping()
    public ResponseEntity<Product> salvar(@RequestBody Product product) {





    }


}
