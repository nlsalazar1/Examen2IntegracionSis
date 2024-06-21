package com.springboot.pruebaapis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.pruebaapis.entity.OrdenCompra;
import com.springboot.pruebaapis.repository.OrdenCompraRepository;

@Service
public class OrdenCompraImplement implements IOrdenCompraService {

	@Autowired
	private OrdenCompraRepository ordenCompraRepository;
	
	@Override
	public List<OrdenCompra> listarTodos() {
		// TODO Auto-generated method stub
		return (List<OrdenCompra>) ordenCompraRepository.findAll();
	}

	@Override
	public void guardar(OrdenCompra ordenCompra) {
		ordenCompraRepository.save(ordenCompra);
	}

	@Override
	public OrdenCompra buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return ordenCompraRepository.findById(id).orElse(null);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		ordenCompraRepository.deleteById(id);
	}

}
