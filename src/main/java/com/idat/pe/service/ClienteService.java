package com.idat.pe.service;

import java.util.List;

import com.idat.pe.modelo.Cliente;



public interface ClienteService {
	
	 public void guardarCliente(Cliente c);
	 public void eliminarCliente(Integer id);
	 public void editarCliente(Cliente  c);
	 public List<Cliente> listarCliente();
	 public Cliente clienteById(Integer id);

}
