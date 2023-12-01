package com.barataribeiro.springpadroesprojeto.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.barataribeiro.springpadroesprojeto.model.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}