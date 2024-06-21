package com.springboot.pruebaapis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.pruebaapis.entity.Factura;
import com.springboot.pruebaapis.repository.FacturaRepository;

@Service
public class FacturaServiceImplement implements IFacturaService {

	@Autowired
	private FacturaRepository facturaRepository;
	
	@Override
	public List<Factura> listarTodos() {
		// TODO Auto-generated method stub
		return (List<Factura>) facturaRepository.findAll();
	}

	@Override
	public void guardar(Factura factura) {
		facturaRepository.save(factura);

	}

	@Override
	public Factura buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return facturaRepository.findById(id).orElse(null);
	}

	@Override
	public void eliminar(Integer id) {
		facturaRepository.deleteById(id);
	}

}
