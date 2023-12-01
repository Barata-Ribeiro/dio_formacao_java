package com.barataribeiro.springpadroesprojeto.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.barataribeiro.springpadroesprojeto.model.Endereco;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {

}
