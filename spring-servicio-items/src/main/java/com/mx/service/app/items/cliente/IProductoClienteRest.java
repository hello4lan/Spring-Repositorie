package com.mx.service.app.items.cliente;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.mx.service.app.items.modelos.Producto;

@FeignClient(name="servicio-productos")
public interface IProductoClienteRest {
	
	@GetMapping(value = "/productos")
	public List<Producto> findAll();
	
	@GetMapping(value="/producto/{id}")
	public Producto findById(@PathVariable Long id);

}
