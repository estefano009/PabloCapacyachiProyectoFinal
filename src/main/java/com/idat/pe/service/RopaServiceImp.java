package com.idat.pe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.pe.modelo.Ropa;
import com.idat.pe.repository.RopaRepository;

@Service
public class RopaServiceImp implements RopaService {
	
	@Autowired
	private RopaRepository repository;

	@Override
	public void guardarRopa(Ropa r) {
		// TODO Auto-generated method stub
		repository.save(r);

	}

	@Override
	public void eliminarRopa(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);

	}

	@Override
	public void editarRopa(Ropa r) {
		// TODO Auto-generated method stub
		repository.saveAndFlush(r);

	}

	@Override
	public List<Ropa> listarRopa() {
		// TODO Auto-generated method stub
		return repository.findAll();	
	}

	@Override
	public Ropa RopaById(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

}
