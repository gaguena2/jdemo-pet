package com.gaguena.jdemooauth.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gaguena.jdemooauth.controller.exception.BadRequestException;
import com.gaguena.jdemooauth.controller.exception.NotFoundException;
import com.gaguena.jdemooauth.data.PetData;
import com.gaguena.jdemooauth.exception.BaseException;
import com.gaguena.jdemooauth.service.PetService;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/pets")
public class PetController {

  @Autowired
  private PetService petService;

  @GetMapping(path = "/{code}")
  public ResponseEntity<PetData> get(@PathParam("code") String code) {
    return this.petService.get(code).map(PetData::create)
        .map(ResponseEntity::ok)
        .orElseThrow(NotFoundException::new);
  }

  @PostMapping(path = "/")
  public ResponseEntity<PetData> create(@RequestBody PetData data) {
    try {
      var petModel = this.petService.save(data.to());
      return ResponseEntity.status(HttpStatus.CREATED).body(PetData.create(petModel));
    } catch (BaseException ex) {
      throw new BadRequestException();
    }
  }
}
