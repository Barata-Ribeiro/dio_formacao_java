package com.barataribeiro.myfirstwebapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
  @GetMapping
  public String welcome() {
    return "Welcome to my first Spring Boot REST API!";
  }
}