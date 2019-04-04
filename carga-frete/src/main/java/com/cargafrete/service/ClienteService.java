package com.cargafrete.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cargafrete.model.Cliente;
import com.cargafrete.repository.ClienteRepository;

import antlr.collections.List;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	
	public Cliente cadCliente(Cliente cliente) {
		Cliente clienteCad = clienteRepository.save(cliente);
		return clienteCad;
	}
	public List listar(){
		return (List) clienteRepository.findAll();
	}
	public Cliente getCliente(Long id) {
		return getCliente(id);
	}
	
	public void deletCliente(Long id) {
		Cliente cliente = getCliente(id);
		clienteRepository.delete(cliente);
	}
}
