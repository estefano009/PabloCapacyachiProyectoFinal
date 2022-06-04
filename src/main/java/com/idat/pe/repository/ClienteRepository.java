package com.idat.pe.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.idat.pe.modelo.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
