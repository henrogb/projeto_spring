package com.henro.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.henro.course.entities.User;
import com.henro.course.repositories.UserRepository;


@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
       User u1 = new User(null, "Maria Brown", "maria@gmail.com", "519999988", "12345");
       User u2 = new User(null, "zezinho zeluko", "zeliki@gmail.com", "511231988", "122225");
       userRepository.saveAll(Arrays.asList(u1, u2));
    }
}