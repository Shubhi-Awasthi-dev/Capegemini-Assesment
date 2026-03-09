package com.cg.entity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


import java.time.LocalDate;

public class EmployeeMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        PEmployee obj= new PEmployee();
        obj.setEmpName("Rohit");
        obj.setDob(LocalDate.of(1998, 10, 12));
        obj.setSalary(50000);
        em.persist(obj);
        em.getTransaction().commit();
        System.out.println("Created");
    }
}
