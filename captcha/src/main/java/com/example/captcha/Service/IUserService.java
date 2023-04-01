package com.example.captcha.Service;


import com.example.captcha.model.User;

import java.util.List;
import java.util.Optional;



public interface IUserService {

    void createUser(User user);
    List<User> getAllUsers();
    Optional<User> getOneUser(Integer Id);
}