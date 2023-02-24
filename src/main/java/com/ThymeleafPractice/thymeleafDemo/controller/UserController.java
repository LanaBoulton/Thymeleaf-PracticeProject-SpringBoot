package com.ThymeleafPractice.thymeleafDemo.controller;

import com.ThymeleafPractice.thymeleafDemo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    //handler method to handle variable-expression requesy
    //http://localhost:8080/variable-expression
    @GetMapping("variable-expression")
    public String variableExpression(Model model) {
        User user = new User("Lana", "lana@gmail.com", "ADMIN", "FEMALE");
        model.addAttribute("user", user);
        return "variable-expression";
    }

    //handler to handle selection expressions
    //http://localhost:8080/selection-expression
    @GetMapping("selection-expression")
    public String selectionExpression(Model model) {
        User user = new User("Lana", "lana@gmail.com", "ADMIN", "FEMALE");
        model.addAttribute("user", user);
        return "selection-expression";
    }

    //handler method to handle message expr req
    //http://localhost:8080/message-expression
    @GetMapping("message-expression")
    public String messageExpression() {
        return "message-expression";
    }

    //handler method to handle link expressions
    //http://localhost:8080/link-expression
    @GetMapping("link-expression")
    public String linkExpression(Model model) {
        model.addAttribute("id", 1);
        return "link-expression";
    }

    //handler method to handle fragment expression request
    //http://localhost:8080/fragment-expression
    @GetMapping("fragment-expression")
    public String fragmentExpression() {
        return "fragment-expression";
    }

    //http://localhost:8080/users
    @GetMapping("/users")
    public String users(Model model){
        User admin = new User("Admin",  "adnim@gmail.com", "ADMIN", "Male");
        User ramesh = new User("Ramesh",  "ramesh@gmail.com", "USER", "Male");
        User mila = new User("Mila",  "mila@gmail.com", "USER", "Feale");
        List<User> users = new ArrayList<>();
        users.add(admin);
        users.add(ramesh);
        users.add(mila);
        model.addAttribute("users", users);
        return "users";
    }

    //http://localhost:8080/if-unless
    @GetMapping("/if-unless")
    public String ifUnless(Model model){
        User admin = new User("Admin",  "adnim@gmail.com", "ADMIN", "Male");
        User ramesh = new User("Ramesh",  "ramesh@gmail.com", "USER", "Male");
        User mila = new User("Mila",  "mila@gmail.com", "USER", "Feale");
        List<User> users = new ArrayList<>();
        users.add(admin);
        users.add(ramesh);
        users.add(mila);
        model.addAttribute("users", users);
        return "if-unless";
    }


    //public String swithc

}
