package com.projetotestespringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetotestespringboot.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
