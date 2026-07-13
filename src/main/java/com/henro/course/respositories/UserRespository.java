package com.henro.course.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.henro.course.entities.User;

public interface UserRespository extends JpaRepository<User, Long>{

    
} 