package com.barataribeiro.springsecurityjwt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.barataribeiro.springsecurityjwt.model.User;
import com.barataribeiro.springsecurityjwt.repository.UserRepository;

@Service
public class UserService {
  @Autowired
  private UserRepository repository;
  @Autowired
  private PasswordEncoder encoder;

  public void createUser(User user) {
    String pass = user.getPassword();
    // criptografando antes de salvar no banco
    user.setPassword(encoder.encode(pass));
    repository.save(user);
  }
}
