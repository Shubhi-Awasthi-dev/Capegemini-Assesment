package com.cg.entity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;

import java.util.List;

public class CriteriaDemo {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
        EntityManager em = emf.createEntityManager();

        CriteriaBuilder cb = em.getCriteriaBuilder();

        CriteriaQuery<Object[]> cq = cb.createQuery(Object[].class);

        Root<Product> root = cq.from(Product.class);

        cq.multiselect(root.get("dept"), cb.count(root))
                .groupBy(root.get("dept"));

        List<Object[]> list = em.createQuery(cq).getResultList();

        for(Object[] row : list){
            System.out.println(row[0] + " -> " + row[1]);
        }

        em.close();
        emf.close();
    }
}