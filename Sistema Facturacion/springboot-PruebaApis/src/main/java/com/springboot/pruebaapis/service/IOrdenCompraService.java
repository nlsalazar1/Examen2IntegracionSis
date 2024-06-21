package com.springboot.pruebaapis.service;

import java.util.List;

import com.springboot.pruebaapis.entity.OrdenCompra;

public interface IOrdenCompraService {

	public List<OrdenCompra> listarTodos();
	public void guardar(OrdenCompra factura);
	public OrdenCompra buscarPorId(Integer id);
	public void eliminar(Integer id);
}
