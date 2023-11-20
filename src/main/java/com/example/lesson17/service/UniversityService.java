package com.example.lesson17.service;

import com.example.lesson17.domain.University;

import java.util.List;

public interface UniversityService {
    University save(University university);

    University findById(Long id);

    University update(University university);

    void deleteById(Long id);

    List<University> findAll();

    List<University> findByName(String name);

    List<University> findByAccreditationLevel(Short accreditationLevel);

}
