package com.example.lesson17.domain;

import jakarta.persistence.*;

@Entity
@Table(name="university")
public class University {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @Column
    private Short accreditationLevel;

    @Column
    private Integer numberOfInstitutes;

    @Column
    private Integer numberOfStudents;

    @Column
    private String address;

    public University(String name, short accreditationLevel, int numberOfInstitutes, int numberOfStudents, String address) {
        this.name = name;
        this.accreditationLevel = accreditationLevel;
        this.numberOfInstitutes = numberOfInstitutes;
        this.numberOfStudents = numberOfStudents;
        this.address = address;
    }

    public University() {

    }

    public University(Long id, String name, Short accreditationLevel, Integer numberOfInstitutes, Integer numberOfStudents, String address) {
        this.id = id;
        this.name = name;
        this.accreditationLevel = accreditationLevel;
        this.numberOfInstitutes = numberOfInstitutes;
        this.numberOfStudents = numberOfStudents;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getAccreditationLevel() {
        return accreditationLevel;
    }

    public void setAccreditationLevel(short accreditationLevel) {
        this.accreditationLevel = accreditationLevel;
    }

    public int getNumberOfInstitutes() {
        return numberOfInstitutes;
    }

    public void setNumberOfInstitutes(int numberOfInstitutes) {
        this.numberOfInstitutes = numberOfInstitutes;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "University{" +
                "name='" + name + '\'' +
                ", accreditationLevel=" + accreditationLevel +
                ", numberOfInstitutes=" + numberOfInstitutes +
                ", numberOfStudents=" + numberOfStudents +
                ", address='" + address + '\'' +
                '}';
    }
}
