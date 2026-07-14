package com.henro.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.henro.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

    
} 