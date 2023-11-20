package com.example.lesson17;

import com.example.lesson17.dao.UniversityRepository;
import com.example.lesson17.domain.University;
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

        universityService.save(new University("KNU", (short) 1, 40, 50000, "Kyiv, Gavrylyshina 25"));
        universityService.save(new University("KPI", (short) 2, 20, 35000, "Kyiv, Lesya Ukrainka 50"));
        universityService.save(new University("NTU", (short) 1, 10, 15000, "Kyiv, Shevchenka 43"));
        System.out.println(universityService.findAll());
        System.out.println("========================================================================================");

        System.out.println(universityService.findById((long) 2));
        System.out.println(universityService.findByAccreditationLevel((short)2));

        University universityToUpdate = universityService.findById((long) 2);
        universityToUpdate.setAccreditationLevel((short) 1);
        universityService.update(universityToUpdate);
        System.out.println(universityService.findById((long) 2));
        System.out.println("========================================================================================");

        universityService.deleteById((long) 1);
        System.out.println(universityService.findAll());
    }

}
