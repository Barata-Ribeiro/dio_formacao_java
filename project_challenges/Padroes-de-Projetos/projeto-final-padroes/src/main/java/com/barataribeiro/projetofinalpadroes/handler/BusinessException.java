package com.barataribeiro.projetofinalpadroes.handler;

/**
 * This class defines a custom exception that can be used to indicate a
 * business-related error.
 *
 * @author Barata-Ribeiro
 */
public class BusinessException extends RuntimeException {

  /**
   * Constructs a new BusinessException with the specified message.
   *
   * @param message the error message
   */
  public BusinessException(String message) {
    super(message);
  }

  /**
   * Constructs a new BusinessException with the specified message and parameters.
   *
   * @param message the error message
   * @param params  the parameters to be included in the error message
   */
  public BusinessException(String message, Object... params) {
    super(String.format(message, params));
  }

}