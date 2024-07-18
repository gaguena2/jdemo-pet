package com.gaguena.jdemooauth.controller.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Entity Not Found")
public class NotFoundException extends HttpBaseException {

  private static final long serialVersionUID = 1L;

}
