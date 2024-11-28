package com.codingbox.querydsl;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.codingbox.querydsl.domain.Member;
import com.codingbox.querydsl.domain.QMember;
import com.codingbox.querydsl.domain.Team;
import com.querydsl.core.QueryResults;
import com.querydsl.core.Tuple;
import com.querydsl.jpa.JPAExpressions;
import com.querydsl.jpa.impl.JPAQueryFactory;

import static com.codingbox.querydsl.domain.QMember.*;
import static com.codingbox.querydsl.domain.QTeam.*;

import java.util.List;

public class QueryDSLMain8 {
	
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
			
			/*
			 * 나이가 가장 많은 회원 조회
			 */
			QMember memberSub = new QMember("memberSub");
			
			List<Member> result = queryFactory
									.selectFrom(member)
									.where(
										member.age.eq( 
											JPAExpressions.select(memberSub.age.max())
														  .from(memberSub)
										)
									)
									.fetch();
			
			System.out.println("result : " + result.get(0).getAge());
			
			/*
			 * 나이가 Member의 평균 나이 이상인 회원 
			 */
			List<Member> result2 = queryFactory
									.selectFrom(member)
									.where(
										member.age.goe( 
											JPAExpressions.select(memberSub.age.avg())
														  .from(memberSub)
										)
									)
									.fetch();
			
			List<Member> result3 = queryFactory
									.selectFrom(member)
									.where(
										member.age.in( 
											JPAExpressions
												.select(memberSub.age)
												.from(memberSub)
												.where(memberSub.age.gt(5))
										)
									)
									.fetch();
			
			/*
			 * select절의 서브쿼리
			 */
			List<Tuple> fetch = queryFactory
								.select(member.username,
									JPAExpressions
										.select(memberSub.age.avg())
										.from(memberSub)
								)
								.from(member)
								.fetch();
			
			for( Tuple tuple : fetch ) {
				System.out.println("usernmae = " + tuple.get(member.username));
				System.out.println("age = " + 
					tuple.get(JPAExpressions.select(memberSub.age.avg()).from(memberSub))
				);
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





















