package com.gaguena.jdemooauth.service;

import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.gaguena.jdemooauth.data.PetData;
import com.gaguena.jdemooauth.exception.BaseException;
import com.gaguena.jdemooauth.exception.InvalidAttributeException;
import com.gaguena.jdemooauth.model.PetModel;
import com.gaguena.jdemooauth.repository.AnimalBreedRepository;
import com.gaguena.jdemooauth.repository.PetRepository;

@Service
public class PetService {

  @Autowired
  private PetRepository petRepository;
  @Autowired
  private AnimalBreedRepository animalBreedRepository;
  
  public Optional<PetModel> get(final String code) {
    // TODO Auto-generated method stub
    return null;
  }

  public PetModel save(PetData pet) throws BaseException {
    Optional.ofNullable(pet.breed())
    .filter(breed -> Boolean.logicalOr(
        Objects.nonNull(breed.code()),
        Boolean.TRUE.equals(StringUtils.hasText(breed.name()))
        )
    ).filter(data -> {
      var breed = animalBreedRepository.findByCodeOrName(data.code(), data.name());
    })
    .orElseThrow(InvalidAttributeException::new);
    return null;
  }
}
