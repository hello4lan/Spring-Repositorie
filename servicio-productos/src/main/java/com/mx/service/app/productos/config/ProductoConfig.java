package com.mx.service.app.productos.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mx.service.app.productos.entity.Producto;

@Configuration
public class ProductoConfig {

	@Bean("listaProducto")
	public List<Producto> getProductos(){
		Producto p = new Producto();
		List<Producto> productos = new ArrayList<>();
		p.setId(1L);
		p.setNombre("Xiaomi RedMi 9");
		p.setPrecio(4000.21);
		productos.add(p);
		p = new Producto();
		p.setId(2L);
		p.setNombre("Xiaomi RedMi 8");
		p.setPrecio(3000.21);
		productos.add(p);
		p = new Producto();
		p.setId(3L);
		p.setNombre("Moto G 10");
		p.setPrecio(5020.30);
		productos.add(p);
		p = new Producto();
		p.setId(1L);
		p.setNombre("Xiaomi RedMi 9");
		p.setPrecio(4000.21);
		productos.add(p);
		
		return productos;
	}
}
