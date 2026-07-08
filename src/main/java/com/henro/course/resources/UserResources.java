package com.henro.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.henro.course.entities.User;

@RestController
@RequestMapping(value="/users")
public class UserResources {
    
    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "Henro", "email", "51983191309", "olokinhomeu123");
        return ResponseEntity.ok().body(u);
    }
}