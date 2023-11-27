package com.barataribeiro.myfirstwebapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.barataribeiro.myfirstwebapi.model.Usuario;
import com.barataribeiro.myfirstwebapi.repository.UsuarioRepository;

@RestController
@RequestMapping("/users")
public class UsuarioController {
  @Autowired
  private UsuarioRepository repository;

  @GetMapping()
  public List<Usuario> getUsers() {
    return repository.findAll();
  }

  @GetMapping("/{username}")
  public Usuario getOneOnerByUsername(@PathVariable("username") String username) {
    return repository.findByUsername(username);
  }

  @DeleteMapping("/{id}")
  public void deleteUser(@PathVariable("id") Integer id) {
    repository.deleteById(id);
  }

  @PostMapping()
  public void createUser(@RequestBody Usuario usuario) {
    repository.save(usuario);
  }
}
