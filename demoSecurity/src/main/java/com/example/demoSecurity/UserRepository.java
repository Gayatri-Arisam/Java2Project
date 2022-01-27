package com.example.demoSecurity;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demoSecurity.Models.Users;

public interface UserRepository extends JpaRepository<Users, Integer>  {
Users findByUsername(String username);
}
