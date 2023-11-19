package com.example.lesson17.domain;

import javax.persistence.*;

@Entity
public class University {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @Column
    private Short acreditationLevel;

    @Column
    private Integer numberOfInstitutes;

    @Column
    private Integer numberOfStudents;

    @Column
    private String adress;

    public University(String name, short acreditationLevel, int numberOfInstitutes, int numberOfStudents, String adress) {
        this.name = name;
        this.acreditationLevel = acreditationLevel;
        this.numberOfInstitutes = numberOfInstitutes;
        this.numberOfStudents = numberOfStudents;
        this.adress = adress;
    }

    public University() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getAcreditationLevel() {
        return acreditationLevel;
    }

    public void setAcreditationLevel(short acreditationLevel) {
        this.acreditationLevel = acreditationLevel;
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

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "University{" +
                "name='" + name + '\'' +
                ", acreditationLevel=" + acreditationLevel +
                ", numberOfInstitutes=" + numberOfInstitutes +
                ", numberOfStudents=" + numberOfStudents +
                ", adress='" + adress + '\'' +
                '}';
    }
}
