package com.wildcodeschool.wildandwizard.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    //Simple Many-to-Many Relationship without attributes
    //create a **two-way relationship **
    //A Course can have many Wizards
    //mappedBy = "courses": refers to the attribute courses within the class Wizard
    @ManyToMany(mappedBy = "courses")
    private List<Wizard> wizards = new ArrayList<>();


    public Course() {
    }

    public Course(String name) {
        this.name = name;
    }

    public Long getId() {
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

    public List<Wizard> getWizards() {
        return wizards;
    }

    public void setWizards(List<Wizard> wizards) {
        this.wizards = wizards;
    }
}
