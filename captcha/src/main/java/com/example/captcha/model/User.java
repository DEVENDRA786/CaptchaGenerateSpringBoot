package com.example.captcha.model;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "USER1")
public class User {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String email;

    @Transient
    private String captcha;

    @Transient
    private String hiddenCaptcha;

    @Transient
    private String realCaptcha;
}