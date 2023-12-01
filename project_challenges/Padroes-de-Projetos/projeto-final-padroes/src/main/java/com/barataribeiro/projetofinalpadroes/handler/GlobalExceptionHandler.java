package com.barataribeiro.projetofinalpadroes.handler;

import org.springframework.cglib.proxy.UndeclaredThrowableException;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.barataribeiro.projetofinalpadroes.model.ResponseError;

import jakarta.annotation.Resource;

/**
 * This class handles all the exceptions that occur in the application. It uses
 * the MessageSource
 * bean to retrieve the error messages for each exception. It extends the
 * ResponseEntityExceptionHandler
 * class, which provides default behavior for handling exceptions in REST
 * controllers.
 *
 * @author Barata-Ribeiro
 */
@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

  /**
   * The MessageSource bean is used to retrieve the error messages for each
   * exception.
   */
  @Resource
  private MessageSource messageSource;

  /**
   * This method returns the HTTP headers with the content type set to
   * application/json.
   */
  private HttpHeaders headers() {
    HttpHeaders headers = new HttpHeaders();
    headers.setContentType(MediaType.APPLICATION_JSON);
    return headers;
  }

  /**
   * This method creates a ResponseError object with the given message and status
   * code.
   */
  private ResponseError responseError(String message, HttpStatus statusCode) {
    ResponseError responseError = new ResponseError();
    responseError.setStatus("error");
    responseError.setError(message);
    responseError.setStatusCode(statusCode.value());
    return responseError;
  }

  /**
   * This method handles general exceptions by checking if the exception is an
   * UndeclaredThrowableException.
   * If it is, it gets the underlying BusinessException and handles it. Otherwise,
   * it returns a generic error message.
   */
  @ExceptionHandler(Exception.class)
  public ResponseEntity<Object> handleGeneral(Exception e, WebRequest request) {
    if (e instanceof UndeclaredThrowableException) {
      Throwable undeclaredThrowable = ((UndeclaredThrowableException) e).getUndeclaredThrowable();
      if (undeclaredThrowable instanceof BusinessException) {
        return handleBusinessException((BusinessException) undeclaredThrowable, request);
      }
    }
    String message = messageSource.getMessage("error.server", new Object[] { e.getMessage() }, null);
    ResponseError error = responseError(message, HttpStatus.INTERNAL_SERVER_ERROR);
    return new ResponseEntity<>(error, headers(), HttpStatus.INTERNAL_SERVER_ERROR);
  }

  /**
   * This method handles BusinessException by returning the error message and
   * status code specified in the exception.
   */
  @ExceptionHandler({ BusinessException.class, RequiredFieldException.class })
  public ResponseEntity<Object> handleBusinessException(BusinessException e, WebRequest request) {
    ResponseError error = responseError(e.getMessage(), HttpStatus.BAD_REQUEST);
    return new ResponseEntity<>(error, headers(), HttpStatus.BAD_REQUEST);
  }
}