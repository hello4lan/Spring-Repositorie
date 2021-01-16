package com.mx.service.app.items.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mx.service.app.items.modelos.Item;
import com.mx.service.app.items.modelos.Producto;
import com.mx.service.app.items.service.IItemService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class ItemController {

	@Autowired
	@Qualifier("serviceRestTemplate")
	private IItemService itemService;
	
	@GetMapping(value = "/items")
	public List<Item> items(){
		
		return itemService.findAll();
	}
	
	//@HystrixCommand(fallbackMethod = "exceptionMethod" )
	@GetMapping(value = "/item/{id}/{cantidad}")
	public Item getItem(@PathVariable Long id, @PathVariable Integer cantidad) {
		
		return itemService.findById(id, cantidad);
	}
	
	public Item exceptionMethod( Long id,  Integer cantidad) {
		
		Item item = new Item();
		
		Producto producto = new Producto();
		item.setCantidad(cantidad);
		producto.setId(id);
		producto.setNombre("laptop Aspire V5");
		producto.setPrecio(3000.20);
		item.setProducto(producto);
		
		return item;
	}
}


