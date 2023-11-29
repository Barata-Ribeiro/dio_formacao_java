package com.barataribeiro.springsecurityjwt.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "tab_user")
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_user")
  private Integer id;
  @Column(length = 50, nullable = false)
  private String name;
  @Column(length = 20, nullable = false)
  private String username;
  @Column(length = 100, nullable = false)
  private String password;
  @ElementCollection(fetch = FetchType.EAGER)
  @CollectionTable(name = "tab_user_roles", joinColumns = @JoinColumn(name = "user_id"))
  @Column(name = "role_id")
  private List<String> roles = new ArrayList<>();

  /**
   * 
   */
  public User() {
  }

  /**
   * @param username
   */
  public User(String username) {
    this.username = username;
  }

  /**
   * @return the id
   */
  public Integer getId() {
    return id;
  }

  /**
   * @param id the id to set
   */
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * @return the username
   */
  public String getUsername() {
    return username;
  }

  /**
   * @param username the username to set
   */
  public void setUsername(String username) {
    this.username = username;
  }

  /**
   * @return the password
   */
  public String getPassword() {
    return password;
  }

  /**
   * @param password the password to set
   */
  public void setPassword(String password) {
    this.password = password;
  }

  /**
   * @return the roles
   */
  public List<String> getRoles() {
    return roles;
  }

  /**
   * @param roles the roles to set
   */
  public void setRoles(List<String> roles) {
    this.roles = roles;
  }

}
