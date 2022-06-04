package com.idat.pe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.pe.modelo.Lavadora;
import com.idat.pe.repository.LavadoraRepository;


@Service
public class LavadoraServiceImp implements LavadoraService {

	@Autowired
	private LavadoraRepository repository;
	
	@Override
	public void guardarLavadora(Lavadora l) {
		// TODO Auto-generated method stub
		repository.save(l);
	}

	@Override
	public void eliminarLavadora(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public void editarLavadora(Lavadora l) {
		// TODO Auto-generated method stub
		repository.saveAndFlush(l);
	}

	@Override
	public List<Lavadora> listarLavadora() {
		// TODO Auto-generated method stub
		return repository.findAll();	
	}

	@Override
	public Lavadora lavadoraById(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

}
