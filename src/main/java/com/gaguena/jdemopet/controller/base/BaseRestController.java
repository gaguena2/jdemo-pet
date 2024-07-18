package com.gaguena.jdemopet.controller.base;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public abstract class BaseRestController<T> {

  public ResponseEntity<T> Ok(T t) {
    return ResponseEntity.ok(t);
  }

  public ResponseEntity<T> Create(T t) {
    return ResponseEntity.status(HttpStatus.CREATED).body(t);
  }

}
