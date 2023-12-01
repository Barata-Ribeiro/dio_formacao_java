package com.barataribeiro.projetofinalpadroes.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.barataribeiro.projetofinalpadroes.model.ContaBancaria;

@Repository
public interface ContaBancariaRepository extends CrudRepository<ContaBancaria, UUID> {

}
