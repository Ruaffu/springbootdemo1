package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig
{
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
           Student gordon = new Student("Gordon Freeman","gdog@blackmesa.science", LocalDate.of(1985, SEPTEMBER, 18));
           Student alyx = new Student("Alyx Vance","alyx@gmail.com", LocalDate.of(1996, JUNE, 19));

           repository.saveAll(List.of(gordon, alyx));
        };
    }
}
