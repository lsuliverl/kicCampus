package com.codingbox.springshop.service;


import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.codingbox.springshop.domain.Item;
import com.codingbox.springshop.repository.ItemRepository;

import lombok.RequiredArgsConstructor;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class ItemService {

	private final ItemRepository itemRepository;

	
	// 메서드 이름 	: void, saveItem()
	@Transactional
	public void saveItem(Item item) {
		itemRepository.save(item);
	}

	// 메서드		: findItems()
	// return	: List
	public List<Item> findItems() {
		return itemRepository.findAll();
	}

	// item하나 조회
	// 메서드명 : findOne
	public Item findOne(Long itemId) {
		return itemRepository.findOne(itemId);
	}

	@Transactional
	public Item updateItem(Long id, Item form) {
		// id값을 기반으로해서 실제 영속상태의 데이터를 찾아온다.
		Item findItem = itemRepository.findOne(id);
		findItem.setPrice(form.getPrice());
		findItem.setName(form.getName());
		findItem.setStockQuantity(form.getStockQuantity());

		/*
		 * 영속성 컨텍스트 영역에서 save or merge와 같은 메서드를 호출할 필요가 없다.
		 * itemrepository.save(findItem);
		 * 
		 * 영속성 컨텍스트에 변화가 일어나게 되고, 변화가 일어나는 것을 jpa가 감지하게 된다.
		 * 따라서 spring의 Transactional에서 commit이 일어나게되고,
		 * 영속성 컨텍스트가 flush를 호출하게 된다.
		 * flush : 영속성 컨텍스트에서 변화가 생긴 부분을 감지 후 -> update요청
		 * => 변경 감지에 의해서 데이터를 update하는 방법이다.
		 */
		
		return findItem;
	}
	
	
	
}
















