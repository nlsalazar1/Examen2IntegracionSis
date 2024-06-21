package com.springboot.pruebaapis.service;

import java.util.List;

import com.springboot.pruebaapis.entity.Factura;

public interface IFacturaService {

	public List<Factura> listarTodos();
	public void guardar(Factura factura);
	public Factura buscarPorId(Integer id);
	public void eliminar(Integer id);
}
