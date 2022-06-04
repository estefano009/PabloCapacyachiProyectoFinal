package com.idat.pe.modelo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Table(name = "lavadora")
@Entity
@Getter
@Setter
public class Lavadora {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idLavadora;
	private String descripcion;
	private String marca;
	private String voltaje;
	
	@ManyToMany(mappedBy = "lavadora" , cascade = {CascadeType.PERSIST ,CascadeType.MERGE})
	private List<Ropa> ropa = new ArrayList<>();

	

	
	
	
	
}
