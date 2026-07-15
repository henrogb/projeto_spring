package com.henro.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.henro.course.entities.User;

//interface que implementa a interação de dados OBJ/BD
public interface UserRepository extends JpaRepository<User, Long>{

    
} 