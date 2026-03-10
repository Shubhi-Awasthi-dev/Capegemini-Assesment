package com.cg.OneToOne;
import java.time.LocalDate;

import jakarta.persistence.*;

public class PersonMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Person p = new Person("Shubhi", LocalDate.of(2002,11,12));
        Dl obj = new Dl(LocalDate.of(2031,12,10), LocalDate.of(2011, 12, 8), "LMV,HMV");
        p.setDl(obj);
        // em.persist(obj);
        em.persist(p);
        em.getTransaction().commit();
    }
}