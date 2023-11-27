package com.barataribeiro.myfirstwebapi.model;

public class Usuario {
  private Integer id;
  private String login;
  private String password;

  public Usuario() {
  }

  public Usuario(String login, String password) {
    this.login = login;
    this.password = password;
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
   * @return the login
   */
  public String getLogin() {
    return login;
  }

  /**
   * @param login the login to set
   */
  public void setLogin(String login) {
    this.login = login;
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

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("Usuario [id=").append(id).append(", login=").append(login).append(", password=").append(password)
        .append("]");
    return builder.toString();
  }

}
