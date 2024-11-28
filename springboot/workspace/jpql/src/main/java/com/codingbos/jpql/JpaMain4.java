package com.codingbos.jpql;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.print.attribute.standard.Media;

public class JpaMain4 {
	
	public static void main(String[] args) {
		EntityManagerFactory emf 
			= Persistence.createEntityManagerFactory("hello");
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		try {
			for(int i = 0; i<100; i++) {
				Member member = new Member();
				member.setUsername("member" + i);
				member.setAge(i);
				em.persist(member);
			}
			
			em.flush();
			em.clear();
			
			// 페이징 처리
			// order by 들어가야 한다
			String jpql = "select m from Member m order by m.age desc";
			List<Member> resultList = em.createQuery(jpql, Member.class)
										.setFirstResult(10)
										.setMaxResults(20)
										.getResultList();
					
			System.out.println("result.size : " + resultList.size());
			
			for(Member member1 : resultList) {
				System.out.println("member1 = " + member1);
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





















