package com.idat.pe.modelo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;



@Table(name = "ropa")
@Entity
@Getter
@Setter
public class Ropa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idRopa;
	private String tipoRopa;
	private String descripcion;
	
	@ManyToMany(mappedBy = "ropa" , cascade = {CascadeType.PERSIST ,CascadeType.MERGE})
	private List<Cliente> cliente = new ArrayList<>();
	
	
	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(
            name = "ropa_lavadora",
            joinColumns = @JoinColumn(name = "idRopa"),
            inverseJoinColumns = @JoinColumn(name = "idLavadora")
			)
	private List<Lavadora> lavadora = new ArrayList<>();



}
