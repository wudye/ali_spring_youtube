package com.mwu.learn1.student;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.Period;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue
    private Integer id;

    private String firstname;
    private String lastname;
    private LocalDate dataOfBirth;
    @Column(unique = true, nullable = false)
    private String email;
    @Transient
    private int age;


    public Student() {
    }

    public Student(String firstname, String lastname, LocalDate dataOfBirth, String email, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.dataOfBirth = dataOfBirth;
        this.email = email;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Student(Integer id, String firstname, String lastname, LocalDate dataOfBirth, String email, int age) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.dataOfBirth = dataOfBirth;
        this.email = email;
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getDataOfBirth() {
        return dataOfBirth;
    }

    public void setDataOfBirth(LocalDate dataOfBirth) {
        this.dataOfBirth = dataOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return Period.between(dataOfBirth, LocalDate.now()).getYears();
    }

    public void setAge(int age) {
        this.age = age;
    }
}


