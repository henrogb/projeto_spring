package com.henro.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.henro.course.entities.Order;
import com.henro.course.entities.User;
import com.henro.course.repositories.OrderRepository;
import com.henro.course.repositories.UserRepository;

//classe de configuração para o perfil de teste
//a classe de configuração é uma classe auxiliar
@Configuration
@Profile("test")
                //ComandLineRunner inicia junto com o spring
public class TestConfig implements CommandLineRunner{

    //injeção de depencia "automatica" do spring
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    //impletmentação do método do ComandLineRunner
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "519999988", "12345");
        User u2 = new User(null, "zezinho zeluko", "zeliki@gmail.com", "511231988", "122225");
        Order o1 = new Order(null, Instant.parse( "2019-06-20T19:53:07Z"), u1);
        Order o2 = new Order(null, Instant.parse( "2019-06-20T19:53:07Z"), u2);
       //
       userRepository.saveAll(Arrays.asList(u1, u2));
       orderRepository.saveAll(Arrays.asList(o1, o2));
    }
}