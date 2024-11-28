package com.codingbox.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.time.LocalDate;
import java.util.List;

public class JpaMain {
	public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence-unit-name");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        try {
            tx.begin();

            Member member = new Member();
            member.setName("John");
            member.setCity("Seoul");
            member.setStreet("Gangnam");
            member.setZipcode("12345");

            em.persist(member);

            Order order = new Order();
            order.setOrderDate(LocalDate.now());
            order.setStatus("IN PROGRESS");

            member.getOrders().add(order);
            order.setMember(member);

            em.persist(order);

            tx.commit();

            List<Member> members = em.createQuery("select m from Member m", Member.class).getResultList();
            for (Member m : members) {
                System.out.println(m);
            }

        } catch (Exception e) {
            e.printStackTrace();
            tx.rollback();
        } finally {
            em.close();
        }

        emf.close();
    }
}






