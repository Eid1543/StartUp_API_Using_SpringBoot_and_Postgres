package com.example.demo;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.model.Startup;
import com.example.demo.repository.StartupRepository;

@SpringBootApplication
public class StartupsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(StartupsApiApplication.class, args);
	}
	

	
	// seeding some initial data into the database
    @Bean
    CommandLineRunner commandLineRunner(StartupRepository startupRepository) {
        return args -> {
            Startup s1 = new Startup(
            		165349.2,
            		136897.8,
            		471784.1,
            		"New York",
            		192261.83
            );

            Startup s2 = new Startup(
            		162597.7,
            		151377.59,
            		443898.53,
            		"California",
            		191792.06
            );
            
            Startup s3 = new Startup(
            		153441.51,
            		101145.55,
            		407934.54,
            		"Florida",
            		191050.39
            );

            Startup s4 = new Startup(
            		144372.41,
            		118671.85,
            		383199.62,
            		"New York",
            		182901.99
            );
            
            Startup s5 = new Startup(
            		142107.34,
            		91391.77,
            		366168.42,
            		"Florida",
            		166187.94
            );
            
            System.out.println("seeding initial data into the database");
            startupRepository.saveAll(List.of(s1,s2,s3,s4,s5));


        };
    }
	
	

}
