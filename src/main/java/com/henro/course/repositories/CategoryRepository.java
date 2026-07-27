package com.henro.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.henro.course.entities.Category;
import com.henro.course.entities.Order;

//interface que implementa a interação de dados OBJ/BD
public interface CategoryRepository extends JpaRepository<Category, Long>{

    
} 