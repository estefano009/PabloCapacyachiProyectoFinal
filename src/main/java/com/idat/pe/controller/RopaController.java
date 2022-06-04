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
import com.idat.pe.modelo.Ropa;
import com.idat.pe.service.RopaService;

@RestController
@RequestMapping("/ropa")
public class RopaController {

	
	@Autowired
	private RopaService service;
	
	@RequestMapping(method = RequestMethod.GET, path = "/listar")
	public ResponseEntity<List<Ropa>>listar(){
		
		return new ResponseEntity<List<Ropa>>(service.listarRopa(),HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.POST, path = "/guardar")
	public ResponseEntity<Void> guardar(@RequestBody Ropa ropa){
		service.guardarRopa(ropa);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/listar/{id}")
	public @ResponseBody ResponseEntity<Ropa> buscarById(@PathVariable Integer id){
		Ropa ropa = service.RopaById(id);
		if(ropa != null) {
			return new ResponseEntity<Ropa>(ropa, HttpStatus.OK);

		}
		return new ResponseEntity<Ropa>(HttpStatus.NOT_FOUND);

	}
	
	@RequestMapping(method = RequestMethod.DELETE, path = "/eliminar/{id}")
	public ResponseEntity<Void> eliminar(@PathVariable Integer id){
		Ropa ropa = service.RopaById(id);
		if(ropa != null) {
			service.eliminarRopa(id);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);

	}
	
	@RequestMapping(method = RequestMethod.PUT, path = "/editar")
	public ResponseEntity<Void> editar(@RequestBody Ropa ropa){
		Ropa ropas = service.RopaById(ropa.getIdRopa());
		if(ropas!= null) {
			service.editarRopa(ropas);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}

	
}
