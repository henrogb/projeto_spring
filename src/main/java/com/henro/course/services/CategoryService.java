package com.henro.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.henro.course.entities.Category;
import com.henro.course.repositories.CategoryRepository;

@Service
//o @Service é uma notation para dizer que aquela classe faz parte do spring
//isso é necessário para podermos fazer a injeção de dependencia 
public class CategoryService {

    @Autowired
    private CategoryRepository repository;
    
    public List<Category> findAll(){
        return repository.findAll();
    }

    public Category findById(Long id){
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }
}
