package com.aditya.springbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.aditya.springbackend.model.User;
import com.aditya.springbackend.repository.UserRepository;

@SpringBootApplication
public class SpringbackendApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringbackendApplication.class, args);
    }

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        this.userRepository.save(new User("Monkey", " D. Luffy", "KingOfThePirates@gmail.com"));
        this.userRepository.save(new User("Roronoa", "Zoro", "No.1Swordsman@gmail.com"));
        this.userRepository.save(new User("Eren", "Yeager", "AttackTitan@gmail.com"));
        this.userRepository.save(new User("Ichigo", "Kurosaki", "StrongestSoulReaper@gmail.com"));
    }
}