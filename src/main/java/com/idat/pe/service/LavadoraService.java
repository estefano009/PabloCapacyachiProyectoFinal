package com.idat.pe.service;

import java.util.List;

import com.idat.pe.modelo.Lavadora;

public interface LavadoraService {
	
	 public void guardarLavadora(Lavadora c);
	 public void eliminarLavadora(Integer id);
	 public void editarLavadora(Lavadora  c);
	 public List<Lavadora> listarLavadora();
	 public Lavadora lavadoraById(Integer id);
}
