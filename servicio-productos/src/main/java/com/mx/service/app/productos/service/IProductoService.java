package com.mx.service.app.productos.service;

import java.util.List;

import com.mx.service.app.productos.entity.Producto;

public interface IProductoService {

	public List<Producto> findAll();
	public Producto findById(Long id);
}
