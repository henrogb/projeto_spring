package com.henro.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.henro.course.entities.Product;

//interface que implementa a interação de dados OBJ/BD 
//interface que ja vem com os metodos saveAll() e outros de persistencia 
public interface ProductRepository extends JpaRepository<Product, Long>{

    
} 