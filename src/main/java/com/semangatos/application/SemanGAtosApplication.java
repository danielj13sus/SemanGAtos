package com.semangatos.application;

import com.semangatos.domains.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class SemanGAtosApplication {

    public static void main(String[] args) {
        SpringApplication.run(SemanGAtosApplication.class, args);

        Scanner input = new Scanner(System.in);

        input.close();
    }

}
