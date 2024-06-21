package com.springboot.pruebaapis.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.pruebaapis.entity.Factura;

@Repository
public interface FacturaRepository extends CrudRepository<Factura, Integer> {

}
