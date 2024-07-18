package com.gaguena.jdemooauth.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gaguena.jdemooauth.model.AnimalBreedModel;

@Repository
public interface AnimalBreedRepository extends JpaRepository<AnimalBreedModel, Long>{

  public Optional<AnimalBreedModel> findByCodeOrName(Long code, String name);

}
