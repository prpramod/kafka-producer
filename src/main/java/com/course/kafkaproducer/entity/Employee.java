package com.course.kafkaproducer.entity;

import java.time.LocalDate;

public class Employee {

    private int employeeId;
    private String name;
    private LocalDate birthDate;

    public Employee(int employeeId, String name, LocalDate birthDate) {
        this.employeeId = employeeId;
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
