package com.barataribeiro.projetofinalpadroes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.barataribeiro.projetofinalpadroes.model.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}