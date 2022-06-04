package com.idat.pe.service;

import java.util.List;

import com.idat.pe.modelo.Ropa;

public interface RopaService {

	
	 public void guardarRopa(Ropa c);
	 public void eliminarRopa(Integer id);
	 public void editarRopa(Ropa  c);
	 public List<Ropa> listarRopa();
	 public Ropa RopaById(Integer id);
}
