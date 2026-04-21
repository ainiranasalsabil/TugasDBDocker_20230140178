package com.example.praktikumdb.service;

import com.example.praktikumdb.model.User;
import com.example.praktikumdb.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

// Service untuk mengelola data user
@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public User addUser(User request){
        request.setId(UUID.randomUUID().toString());
        return userRepository.save(request);
    }
    
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }


}