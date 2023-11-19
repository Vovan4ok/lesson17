package com.example.lesson17.service;

import com.example.lesson17.domain.University;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.stream.Stream;

public interface UniversityService {
    University save(University university);

    University findById(Long id);

    University update(University university);

    void deleteById(Long id);

    List<University> findAll();

    List<University> findByName(String name);

    List<University> findByAccreditationLevel(Short accreditationLevel);

    Stream<University> findByNameReturnsStream(String name);
}
