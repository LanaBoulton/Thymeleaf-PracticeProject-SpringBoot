package com.myStudyNotebook.notebook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//this class will handle HTTP request
@Controller
public class HelloWorldController {

    //handler method to handle "/helloWorld" request
    // http://localhost:8080/hello-world
    @GetMapping("/hello-world")
    public String helloWorld(Model model){
        model.addAttribute("message", "Hello World");
        return "hello-world"; //Thymeleaf view
    }
}
