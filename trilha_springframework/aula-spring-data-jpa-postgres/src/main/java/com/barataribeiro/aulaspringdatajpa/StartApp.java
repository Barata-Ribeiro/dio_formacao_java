package com.barataribeiro.aulaspringdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.barataribeiro.aulaspringdatajpa.model.User;
import com.barataribeiro.aulaspringdatajpa.repository.UserRepository;

@Component
public class StartApp implements CommandLineRunner {
  @Autowired
  private UserRepository repository;

  @Override
  public void run(String... args) throws Exception {
    User user = new User();
    user.setName("Barata Ribeiro");
    user.setUsername("BarataRibeiro");
    user.setPassword("1234567890");

    repository.save(user);

    for (User u : repository.findAll()) {
      System.out.println(u);
    }
  }

}
