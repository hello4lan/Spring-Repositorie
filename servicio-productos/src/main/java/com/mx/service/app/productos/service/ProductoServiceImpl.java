package com.mx.service.app.productos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mx.service.app.productos.entity.Producto;
import com.mx.service.app.productos.repository.RepositorioProducto;

@Service
public class ProductoServiceImpl implements IProductoService {

	@Autowired
	private RepositorioProducto repoProducto;
	
	@Override
	@Transactional(readOnly = true)
	public List<Producto> findAll() {
		return (List<Producto>) this.repoProducto.findAll();
	}
	
 
	@Override
	@Transactional(readOnly = true)
	public Producto findById(Long id) {
		return this.repoProducto.findById(id).orElse(null);
	}
	


	
}
