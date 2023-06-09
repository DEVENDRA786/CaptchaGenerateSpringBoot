package com.example.captcha.ServiceImpl;

import com.example.captcha.Repository.UserRepository;
import com.example.captcha.Service.IUserService;
import com.example.captcha.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserRepository repo;

    @Override
    public void createUser(User user) {

        repo.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return repo.findAll();
    }

    @Override
    public Optional<User> getOneUser(Integer id) {
        return repo.findById(id);
    }

}