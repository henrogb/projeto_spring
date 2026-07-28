package com.henro.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.henro.course.entities.Category;

//interface que implementa a interação de dados OBJ/BD 
//interface que ja vem com os metodos saveAll() e outros de persistencia 
public interface CategoryRepository extends JpaRepository<Category, Long>{

    
} 