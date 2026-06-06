package com.example.employee.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {

    @GetMapping("/akash")
   public String demo(){
        return "Akash projct run";
    }

}
