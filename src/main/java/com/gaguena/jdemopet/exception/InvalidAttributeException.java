package com.gaguena.jdemopet.exception;

public class InvalidAttributeException extends BaseException {

  private static final long serialVersionUID = 1L;

  public InvalidAttributeException() {
    super();
  }

  public InvalidAttributeException(String message, Throwable cause, boolean enableSuppression,
      boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }

  public InvalidAttributeException(String message, Throwable cause) {
    super(message, cause);
  }

  public InvalidAttributeException(String message) {
    super(message);
  }

  public InvalidAttributeException(Throwable cause) {
    super(cause);
  }

}
