package com.myStudyNotebook.notebook.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class User {
    private String name;
    private String email;
    private String role;
    private String gender;
}
