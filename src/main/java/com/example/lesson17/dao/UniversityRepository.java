package com.example.lesson17.dao;

import com.example.lesson17.domain.University;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Stream;

@Repository("universityRepository")
public interface UniversityRepository extends JpaRepository<University, Long>, CrudRepository<University, Long> {
    List<University> findByName(String name);

    List<University> findByAccreditationLevel(Short accreditationLevel);

    @Query("select e from university e where e.name = :name")
    Stream<University> findByNameReturnsStream(@Param("name") String name);
}
