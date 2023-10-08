package com.web.mywebapp.employee;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(nullable = false, unique = true)
    private Integer Id;
    @Column(nullable = false, length=45)
    private String name;
    @Column(nullable = false, length=45)
    private String email;
    @Column(nullable = false, length=15)
    private LocalDate dob;
    @Column(nullable = false)
    private Integer age;
    @Column(nullable = false)
    private Double salary;
    @Column(nullable = false)
    private String status;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
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

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dob='" + dob + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", status='" + status + '\'' +
                '}';
    }

}