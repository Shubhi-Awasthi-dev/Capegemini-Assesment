package com.cg.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name="product_table")
public class Product {

    @Id
    private int pid;

    private String name;

    private String dept;   // ✅ add this

    private int qty;
    private double price;
    private LocalDate mfd;

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}