package com.mx.service.app.items.service;

import java.util.List;

import com.mx.service.app.items.modelos.Item;

public interface IItemService {

	public List<Item> findAll();
	public Item findById(Long id, Integer cantidad); 
}
