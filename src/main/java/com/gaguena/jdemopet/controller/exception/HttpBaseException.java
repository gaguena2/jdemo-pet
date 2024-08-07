package com.gaguena.jdemopet.controller.exception;

public class HttpBaseException extends RuntimeException{

  private static final long serialVersionUID = 1L;

  public HttpBaseException() {
    super();
  }

  public HttpBaseException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }

  public HttpBaseException(String message, Throwable cause) {
    super(message, cause);
  }

  public HttpBaseException(String message) {
    super(message);
  }

  public HttpBaseException(Throwable cause) {
    super(cause);
  }

  
}
