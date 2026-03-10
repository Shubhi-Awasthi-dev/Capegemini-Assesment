package com.cg.oneToone;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.time.LocalDate;


public class PersonMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Person p=new Person("Rohit", LocalDate.of(1990, 5, 15);
        Dl obj=new Dl( LocalDate.of(2025, 5, 15), LocalDate.of(2020, 5, 15), "LMV,HMV");
        p.setDl(obj);
        em.persist(p);
        em.persist(obj);
        em.getTransaction().commit();
        System.out.println("Person Created....");
    }
}
