package com.cg.oneToone;

import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Person {
    @Generatedvalue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private LocalDate dob;
    @OneToOne
    private Dl dl;

    // Constructor
    public Person() {
    }
    public Person(String name, LocalDate dob, Dl dl) {
        this.name = name;
        this.dob = dob;
        this.dl = dl;
    }
    //setter n getter
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
    public LocalDate getDob() {
        return dob;
    }
    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
    public Dl getDl() {
        return dl;
    }
    public void setDl(Dl dl) {
        this.dl = dl;
    }


}
