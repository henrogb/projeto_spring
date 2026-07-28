package com.henro.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.henro.course.entities.Product;
import com.henro.course.repositories.ProductRepository;

@Service
//o @Service é uma notation para dizer que aquela classe faz parte do spring
//isso é necessário para podermos fazer a injeção de dependencia 
public class ProductService {

    @Autowired
    private ProductRepository repository;
    
    public List<Product> findAll(){
        return repository.findAll();
    }

    public Product findById(Long id){
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }
}
