package com.mx.service.app.items.cliente;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.service.app.items.modelos.Item;
import com.mx.service.app.items.service.IItemService;

@Service(value = "servieFeign")

public class ItemServiceFeign implements IItemService {

	@Autowired
	private IProductoClienteRest clienteFeign;

	@Override
	public List<Item> findAll() {
		return clienteFeign.findAll().stream().map(p -> new Item(p, 1)).collect(Collectors.toList());
	}

	@Override
	public Item findById(Long id, Integer cantidad) {

		return new Item(clienteFeign.findById(id), cantidad);
	}

}
