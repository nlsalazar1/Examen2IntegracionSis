package com.springboot.pruebaapis.service;

import java.util.List;

import com.springboot.pruebaapis.entity.Cliente;

public interface IClienteService {

	public List<Cliente> listarTodos();
	public void guardar(Cliente cliente);
	public Cliente buscarPorId(String id);
	public void eliminar(String id);
}
