package com.cg.entity;

import jakarta.persistence.*;

import java.util.List;

public class ProductMain {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Query q = em.createQuery(
                "update Product p set p.price = p.price + 100 where p.name like :p");

        q.setParameter("p", "%phone%");

        int row = q.executeUpdate();

        System.out.println("Updated -> " + row);

        em.getTransaction().commit();
    }
}