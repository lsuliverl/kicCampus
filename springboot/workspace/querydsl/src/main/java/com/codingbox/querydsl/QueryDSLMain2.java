package com.codingbox.querydsl;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.codingbox.querydsl.domain.Member;
import com.codingbox.querydsl.domain.QMember;
import com.codingbox.querydsl.domain.Team;
import com.querydsl.jpa.impl.JPAQueryFactory;

import static com.codingbox.querydsl.domain.QMember.*;

public class QueryDSLMain2 {
	
	public static void main(String[] args) {
		EntityManagerFactory emf 
			= Persistence.createEntityManagerFactory("hello");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		JPAQueryFactory queryFactory = new JPAQueryFactory(em);
		tx.begin();

		try {
			Team teamA = new Team("teamA");
			Team teamB = new Team("teamB");
			em.persist(teamA);
			em.persist(teamB);
			
			Member member1 = new Member("member1", 10, teamA);
			Member member2 = new Member("member2", 10, teamA);
			Member member3 = new Member("member3", 10, teamB);
			Member member4 = new Member("member4", 10, teamB);
			em.persist(member1);
			em.persist(member2);
			em.persist(member3);
			em.persist(member4);
			
			// 초기화
			em.flush();
			em.clear();
			
			// jpql
			// member1을 찾아라
			String qlString = "select m from Member m where m.username = :username";
			Member findByJpql = em.createQuery(qlString, Member.class)
								  .setParameter("username", "member1")
								  .getSingleResult();
			System.out.println("findByJpql : " + findByJpql.getUsername());
			
			// querDSL
			//QMember m = new QMember("m"); // QMember의 이름을 부여한다. 별칭부여
			//QMember m = QMember.member;
		
//			Member findByQueryDSL = queryFactory.select(member)
//												.from(member)
//												.where(member.username.eq("member1")
//														.and(member.age.between(10, 30)))	// 파라미터 바인딩 처리
//												.fetchOne();
			
			
			Member findByQueryDSL = queryFactory.select(member)
												.from(member)
												.where(
													member.username.eq("member1"),
													member.age.between(10, 30)
												)	
												.fetchOne();
			
			System.out.println("findByQueryDSL : " + findByQueryDSL.getUsername());

			tx.commit();
		}catch (Exception e) {
			tx.rollback();
		} finally {
			em.close();
			emf.close();
		}
	}
}





















