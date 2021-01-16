package com.mx.service.app.productos.controller;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mx.service.app.productos.entity.Producto;
import com.mx.service.app.productos.service.IProductoService;

@RestController
public class ControladorProducto {

	@Value("${server.port}")
	private Integer puerto;
	
	@Autowired
	private IProductoService productoService;
	
	@GetMapping("/productos")
	public List<Producto> findAll(){
		
		return productoService.findAll().stream().map(p -> {
			p.setPort(this.puerto);
			return p;
		}).collect(Collectors.toList());
	}
	
	@GetMapping("/producto/{id}")
	public  Producto findById(@PathVariable Long id) throws Exception {
		Producto producto = productoService.findById(id);
		producto.setPort(this.puerto);
		
		
		Thread.sleep(3000);
		
		return producto;
	} 
	
	
}
