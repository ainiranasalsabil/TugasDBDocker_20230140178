package com.example.praktikumdb.controller;

import com.example.praktikumdb.model.User;
import com.example.praktikumdb.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Controller untuk handle request user
@RestController
@RequestMapping("api/users")
public class UserController {

    private final UserService userService;

    // Constructor injection
    public UserController(UserService userService){
        this.userService = userService;
    }

    // Endpoint untuk membuat user baru
    @PostMapping
    public String createUser(@RequestBody User request){
        userService.addUser(request);
        return "User Berhasil Dibuat";
    }

    // Endpoint untuk mengambil semua user
    @GetMapping
    public List<User> getAllUser(){
        return userService.getAllUsers();
    }

    // Endpoint untuk mengambil user berdasarkan ID
    @GetMapping("/{id}")
    public User getUserById(@PathVariable String id){
        return userService.getUserById(id);
    }

    // Endpoint untuk update user
    @PutMapping("/{id}")
    public String updateUser(@PathVariable String id, @RequestBody User request){
        userService.updateUser(id, request);
        return "User berhasil diupdate";
    }

    // Endpoint untuk delete user
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable String id){
        userService.deleteUser(id);
        return "User Berhasil Dihapus";
    }
}