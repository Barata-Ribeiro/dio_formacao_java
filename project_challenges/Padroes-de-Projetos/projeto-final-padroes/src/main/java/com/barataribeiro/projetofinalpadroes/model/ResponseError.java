package com.barataribeiro.projetofinalpadroes.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * This class is a model for representing an error response. It contains the
 * error status, timestamp,
 * status code, and error message.
 * 
 * @author Barata-Ribeiro
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ResponseError {
  private Date timestamp = new Date();
  private String status = "error";
  private int statusCode = 400;
  private String error;
}
