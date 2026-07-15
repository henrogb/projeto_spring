package com.henro.course.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.henro.course.entities.User;
import com.henro.course.repositories.UserRepository;

@Service
//o @Service é uma notation para dizer que aquela classe faz parte do spring
//isso é necessário para podermos fazer a injeção de dependencia 
public class UserService {

    @Autowired
    private UserRepository repository;
    
    public List<User> findAll(){
        return repository.findAll();
    }
}
