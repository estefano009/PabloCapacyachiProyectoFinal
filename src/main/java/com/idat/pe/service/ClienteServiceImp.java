package com.idat.pe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.pe.modelo.Cliente;
import com.idat.pe.repository.ClienteRepository;

@Service
public class ClienteServiceImp implements ClienteService {

	@Autowired
	private ClienteRepository repository;
	
	@Override
	public void guardarCliente(Cliente c) {
		// TODO Auto-generated method stub
		repository.save(c);
	}

	@Override
	public void eliminarCliente(Integer id) {
		// TODO Auto-generated method stub
		
		repository.deleteById(id);

	}

	@Override
	public void editarCliente(Cliente c) {
		// TODO Auto-generated method stub
		repository.saveAndFlush(c);

	}

	@Override
	public List<Cliente> listarCliente() {
		// TODO Auto-generated method stub
		return repository.findAll();	
		
	}

	@Override
	public Cliente clienteById(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

}
