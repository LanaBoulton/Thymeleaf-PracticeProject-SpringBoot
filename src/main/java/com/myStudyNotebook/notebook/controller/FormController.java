package com.myStudyNotebook.notebook.controller;

import com.myStudyNotebook.notebook.model.UserForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class FormController {

    //handler method to dandle user registration request
    //
    @GetMapping("register")
    public String userRegistrationPage(Model model) {
        // Emptu user form model object to store form data
        UserForm userForm = new UserForm();
        model.addAttribute("userForm", userForm);

        List<String> listProfession = Arrays.asList("Developer", "tester", "Architect");
        model.addAttribute("listProfession", listProfession);
        return "register-form"; //match html file name
    }

    //handler method to handle user registration form submission request

    @PostMapping("register/save")
    public String submitForm(Model model, @ModelAttribute("userForm") UserForm userForm) {
        model.addAttribute("userForm", userForm);
        return "register-success";
    }
}
