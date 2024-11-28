package com.codingbox.querydsl;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.codingbox.querydsl.domain.Member;
import com.codingbox.querydsl.domain.QMember;
import com.codingbox.querydsl.domain.Team;
import com.querydsl.core.QueryResults;
import com.querydsl.jpa.impl.JPAQueryFactory;

import static com.codingbox.querydsl.domain.QMember.*;

import java.util.List;

public class QueryDSLMain4 {
	
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
			Member member5 = new Member(null, 100, teamB);
			Member member6 = new Member("member5", 100, teamB);
			Member member7 = new Member("member6", 100, teamB);
			em.persist(member1);
			em.persist(member2);
			em.persist(member3);
			em.persist(member4);
			em.persist(member5);
			em.persist(member6);
			em.persist(member7);
			
			// 초기화
			em.flush();
			em.clear();
			
			// 페이징
			List<Member> result2 = queryFactory
									.selectFrom(member)
									.orderBy(member.username.desc())
									.offset(1)	// 시작위치 : zero index, 페이지 번호
									.limit(2)	// 최대 2건 조회, 페이지 사이즈
									.fetch();
			
			
			
			
			
			
			
			/*
			 * 회원 정렬 순서
			 * 1. 회원 나이 내림차순(desc)
			 * 2. 회원 이름 오름차순(asc)
			 * 단, 2에서 회원 이름이 없으면 마지막에 출력(nulls last)
			 */
			
			List<Member> result = queryFactory
								.selectFrom(member)
								.where(member.age.eq(100))
								.orderBy(member.age.desc(), member.username.asc().nullsLast())
								.fetch();
			
			Member resultMember5 = result.get(0);
			Member resultmember6 = result.get(1);
			Member memberNull = result.get(2);
			
			System.out.println("resultMember5 : " + resultMember5);
			System.out.println("resultmember6 : " + resultmember6);
			System.out.println("memberNull : " + memberNull);
					
			
			
			
			tx.commit();
		}catch (Exception e) {
			tx.rollback();
		} finally {
			em.close();
			emf.close();
		}
	}
}





















