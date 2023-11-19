package com.example.lesson17;

import com.example.lesson17.service.UniversityService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {"com.example.lesson17.*"} )
@EnableJpaRepositories(basePackages = {"com.example.lesson17.*"})
public class Lesson17Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(Lesson17Application.class, args);
        UniversityService universityService = ctx.getBean(UniversityService.class);
    }

}
