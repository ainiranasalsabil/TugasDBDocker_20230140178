package com.example.praktikumdb.repository;

import com.example.praktikumdb.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}