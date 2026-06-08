package com.wellsfargo.counselor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import com.wellsfargo.counselor.entity.Client;
import com.wellsfargo.counselor.repository.ClientRepository;

@SpringBootApplication
public class CounselorApplication {

    public static void main(String[] args) {
        SpringApplication.run(CounselorApplication.class, args);
    }

    @Bean
    CommandLineRunner loadData(ClientRepository clientRepository) {
        return args -> {
            clientRepository.save(
                    new Client(
                            "Samitha",
                            "Reddy",
                            "Hyderabad",
                            "9876543210",
                            "samitha@gmail.com"
                    )
            );
        };
    }
}