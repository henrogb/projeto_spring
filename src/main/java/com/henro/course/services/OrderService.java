package com.henro.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.henro.course.entities.Order;
import com.henro.course.repositories.OrderRepository;

@Service
//o @Service é uma notation para dizer que aquela classe faz parte do spring
//isso é necessário para podermos fazer a injeção de dependencia 
public class OrderService {

    @Autowired
    private OrderRepository repository;
    
    public List<Order> findAll(){
        return repository.findAll();
    }

    public Order findById(Long id){
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }
}
