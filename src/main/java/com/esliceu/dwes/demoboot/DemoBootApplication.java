package com.esliceu.dwes.demoboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoBootApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(AuthenticateComponent authenticateComponent){
        return args -> {

            //authenticateComponent.authenticate();

        };
    }

}

