package com.cg.oneToMany;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

public class QuestionMain {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("my-pu");
        EntityManager em=emf.createEntityManager();
        em.getTransaction().begin();
        Question q=new Question("What is java?","easy");
        List<Answer> ans=q.getAnswer();
        ans.add(new Answer("java is a programming language"));
        ans.add(new Answer("java is a platform"));
        ans.add(new Answer("java is Simple"));
        q.setAnswer(ans);
        em.persist(q);
        em.getTransaction().commit();
    }
}
