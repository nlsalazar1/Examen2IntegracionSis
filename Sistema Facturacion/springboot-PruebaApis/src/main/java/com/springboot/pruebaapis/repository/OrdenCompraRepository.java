package com.springboot.pruebaapis.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.pruebaapis.entity.OrdenCompra;

@Repository
public interface OrdenCompraRepository extends CrudRepository<OrdenCompra, Integer> {

}
