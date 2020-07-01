package com.example.ictemployee.entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlIDREF;

@Entity
@Table(name = "tbl_employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id",nullable = false)
    private Integer id;

    @Column(name = "name",nullable = false)
    private String name;

    @Column(name = "wage",nullable = false)
    private Float wage;

    public Employee() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWage() {
        return wage;
    }

    public void setWage(float wage) {
        this.wage = wage;
    }
}
