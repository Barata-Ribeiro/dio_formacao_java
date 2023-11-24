package com.barataribeiro.aulaspringdatajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.barataribeiro.aulaspringdatajpa.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
  
}
