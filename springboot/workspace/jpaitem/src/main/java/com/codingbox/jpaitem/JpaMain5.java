package com.codingbox.jpaitem;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.print.attribute.standard.Media;

import com.codingbox.jpaitem.embedded.Address;
import com.codingbox.jpaitem.embedded.Member;
import com.codingbox.jpaitem.embedded.Period;

public class JpaMain5 {
	
	public static void main(String[] args) {
		EntityManagerFactory emf 
			= Persistence.createEntityManagerFactory("hello");
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		try {
			
			List<Member> result = em.createQuery(
				"select m from Member m where m.username like '%kim%' ", Member.class
			).getResultList();
			
			for( Member member : result ) {
				System.out.println("member = " + member);
			}
			
			
			
			tx.commit();
		}catch (Exception e) {
			tx.rollback();
		} finally {
			em.close();
			emf.close();
		}
	}
}





















