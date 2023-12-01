package com.barataribeiro.projetofinalpadroes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.barataribeiro.projetofinalpadroes.model.Banco;

@Repository
public interface BancoRepository extends CrudRepository<Banco, String> {
}
