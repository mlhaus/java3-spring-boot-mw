package edu.kirkwood.java3springbootmw.controller.requests;

import lombok.Data;

@Data
public class LoginRequest {
    private String email;
    private String password;
}
