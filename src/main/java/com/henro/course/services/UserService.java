package com.henro.course.services;

import java.util.List;
import java.util.Optional;

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

    public User findById(Long id){
        //o abstract Optional é um tipo abstrato que pode ou não retornar um obj
        Optional<User> obj = repository.findById(id);
        //aqui como pode imaginar retornamos o obj que ele encontrou ou não
        return obj.get();
    }
}
