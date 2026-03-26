package com.gmail.joaismelo2007.todolist.user;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<UserModel, UUID> {
    UserModel findByUsername(String username);
}
