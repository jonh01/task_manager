package com.example.todolist.user;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * UserRepository
 */
public interface UserRepository extends JpaRepository<UserModel, UUID> {

    UserModel findByUsername(String username);

}