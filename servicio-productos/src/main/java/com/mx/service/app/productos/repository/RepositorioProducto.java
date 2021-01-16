package com.mx.service.app.productos.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mx.service.app.productos.entity.Producto;

public interface RepositorioProducto extends CrudRepository<Producto, Long>{

}
