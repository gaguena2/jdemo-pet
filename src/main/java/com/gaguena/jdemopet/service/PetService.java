package com.gaguena.jdemopet.service;

import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.gaguena.jdemopet.data.PetData;
import com.gaguena.jdemopet.exception.BaseException;
import com.gaguena.jdemopet.exception.InvalidAttributeException;
import com.gaguena.jdemopet.model.PetModel;
import com.gaguena.jdemopet.repository.AnimalBreedRepository;
import com.gaguena.jdemopet.repository.PetRepository;

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
