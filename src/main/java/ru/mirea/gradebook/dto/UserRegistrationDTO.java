package ru.mirea.gradebook.dto;

import lombok.Data;

@Data
public class UserRegistrationDTO {
    private String name;
    private String email;
    private String number;
    private String password;
    private String group;
}
