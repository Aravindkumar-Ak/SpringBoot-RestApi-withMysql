package com.example.SpringBootRestApi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

@Entity
public class Student {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
@NotNull
    private String name;
@Email
    private String email;
    private Long mobileno;

    public Student(){}

    public Student(Long id, String name, String email, Long mobileno) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.mobileno = mobileno;
    }

    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getMobileno() {
        return mobileno;
    }

    public void setMobileno(Long mobileno) {
        this.mobileno = mobileno;
    }
}
