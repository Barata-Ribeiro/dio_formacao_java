package com.barataribeiro.projetofinalpadroes.handler;

/**
 * This class is used to handle business exceptions that occur during the
 * application.
 * 
 * @author Barata-Ribeiro
 */
public class RequiredFieldException extends BusinessException {

  /**
   * Constructs a new RequiredFieldException with the specified field that is
   * required.
   * 
   * @param field the name of the field that is required
   */
  public RequiredFieldException(String field) {
    super("The field " + field + " is required.");
  }

}
