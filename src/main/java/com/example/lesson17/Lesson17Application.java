package com.example.lesson17;

import com.example.lesson17.service.UniversityService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Lesson17Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(Lesson17Application.class, args);
        UniversityService universityService = ctx.getBean(UniversityService.class);
    }

}
