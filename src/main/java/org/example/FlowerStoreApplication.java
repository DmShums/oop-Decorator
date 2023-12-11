package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.example.flowers.Flower;
import org.example.flowers.FlowerColor;
import org.example.flowers.FlowerType;

@RestController
@SpringBootApplication
public class FlowerStoreApplication {
    public static void main(String[] args) {
        SpringApplication.run(FlowerStoreApplication.class, args);
    }
}
