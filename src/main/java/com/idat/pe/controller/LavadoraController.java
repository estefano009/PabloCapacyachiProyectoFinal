package com.idat.pe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.idat.pe.modelo.Lavadora;
import com.idat.pe.service.LavadoraService;

@RestController
@RequestMapping("/lavadora")
public class LavadoraController {

	
	@Autowired
	private LavadoraService service;
	
	@RequestMapping(method = RequestMethod.GET, path = "/listar")
	public ResponseEntity<List<Lavadora>>listar(){
		
		return new ResponseEntity<List<Lavadora>>(service.listarLavadora(),HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.POST, path = "/guardar")
	public ResponseEntity<Void> guardar(@RequestBody Lavadora lavadora){
		service.guardarLavadora(lavadora);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/listar/{id}")
	public @ResponseBody ResponseEntity<Lavadora> buscarById(@PathVariable Integer id){
		Lavadora lavadora = service.lavadoraById(id);
		if(lavadora != null) {
			return new ResponseEntity<Lavadora>(lavadora, HttpStatus.OK);

		}
		return new ResponseEntity<Lavadora>(HttpStatus.NOT_FOUND);

	}
	
	@RequestMapping(method = RequestMethod.DELETE, path = "/eliminar/{id}")
	public ResponseEntity<Void> eliminar(@PathVariable Integer id){
		Lavadora lavadora = service.lavadoraById(id);
		if(lavadora != null) {
			service.eliminarLavadora(id);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);

	}
	
	@RequestMapping(method = RequestMethod.PUT, path = "/editar")
	public ResponseEntity<Void> editar(@RequestBody Lavadora lavadora){
		Lavadora lavadoras = service.lavadoraById(lavadora.getIdLavadora());
		if(lavadoras!= null) {
			service.editarLavadora(lavadoras);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}

	
}
