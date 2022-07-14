package com.example.cratimesheet.service;

import com.example.cratimesheet.entity.User;
import com.example.cratimesheet.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceUserImpl implements ServiceUser{

    @Autowired
    UserRepo userRepo;

    @Override
    public User addUser(User user) {
        System.out.println("user"+user);
        userRepo.save(user);
        return user;
    }
}
