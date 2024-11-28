package com.codingbox.Springtest;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.codingbox.web.domain.member.Member;
import com.codingbox.web.domain.member.MemberRepository;
import com.codingbox.web.item.Item;
import com.codingbox.web.item.ItemRepository;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class TestDataInit {
	private final MemberRepository memberRepository;
	private final StudentRepository itemRepository;

	@PostConstruct
	public void init() {
		itemRepository.save(new student("testA", 10000, 10));
		itemRepository.save(new student("testB", 20000, 20));
		itemRepository.save(new student("testC", 30000, 30));
		
		Member member = new Member();
		member.setLoginId("test");
		member.setPassword("test!");
		member.setName("테스트");
		memberRepository.save(member);
	}
	
}












