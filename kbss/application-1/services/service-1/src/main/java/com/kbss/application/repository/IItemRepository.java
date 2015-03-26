package com.kbss.application.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.kbss.application.domain.Item;

public interface IItemRepository extends CrudRepository<Item, Long>{
	List<Item> findByName(String name);
}