package com.codingbox.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain {
	/*
	 * - 엔티티 매니저 팩토리는 하나만 생성해서 애플리케이션 전체에서 공유
	 * - jpa의 모든 데이터 변경은 트랜잭션 안에서 실행
	 */

	public static void main(String[] args) {
		EntityManagerFactory emf 
			= Persistence.createEntityManagerFactory("hello");
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		try {
			// 비영속 상태
			Member member = new Member();
			member.setId(100L);
			member.setName("newJPA");
			member.setAge(100);
			
			// 여기서부터 영속 상태
			// EntityManager안에있는 여속 컨텍스트 영역에서 관리가 된다는 뜻
			// persist 메소드 호출 후, DB에 저장된다고 했지만 
			// 아직 DB에 저장이 된 상태는 아니다.
			System.out.println("=== before ===");
			em.persist(member);
			System.out.println("=== after ===");
			
			tx.commit();
		}catch (Exception e) {
			tx.rollback();
		} finally {
			em.close();
			emf.close();
		}
	}

}






