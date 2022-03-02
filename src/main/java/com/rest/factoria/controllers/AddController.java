package com.rest.factoria.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class AddController {
    private static int totalValue=1;


    @GetMapping("hello")
    public String Hello(String name, int age){
        return "Hello " + name + " you have " + age + " years";
    }

    @GetMapping("total")
    public int TotalValue (){
        return totalValue;
    }

    @PostMapping("add")
    public int ValueToAdd(int valueToAdd){
        return totalValue += valueToAdd;
    }

}
