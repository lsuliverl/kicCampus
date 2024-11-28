package com.codingbox.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain3 {
	public static void main(String[] args) {
		EntityManagerFactory emf 
			= Persistence.createEntityManagerFactory("hello");
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		try {
			Member2 member = new Member2();
//			member.setId("ID_A");
			member.setUsername("HelloJPA1");
			
			em.persist(member);
			
			tx.commit();
		}catch (Exception e) {
			tx.rollback();
		} finally {
			em.close();
			emf.close();
		}
	}

}






