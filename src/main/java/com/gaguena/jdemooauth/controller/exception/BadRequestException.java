package com.gaguena.jdemooauth.controller.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "Ivalid request value")
public class BadRequestException extends HttpBaseException {

  private static final long serialVersionUID = 1L;

}
