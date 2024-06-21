package com.springboot.pruebaapis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.pruebaapis.entity.Cliente;
import com.springboot.pruebaapis.repository.ClienteRepository;

@Service
public class ClienteServiceImplement implements IClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Override
	public List<Cliente> listarTodos() {
		
		return (List<Cliente>) clienteRepository.findAll();
	}

	@Override
	public void guardar(Cliente cliente) {
		clienteRepository.save(cliente);

	}

	@Override
	public Cliente buscarPorId(String id) {
		
		return clienteRepository.findById(id).orElse(null);
	}

	@Override
	public void eliminar(String id) {
		clienteRepository.deleteById(id);
	}

}
