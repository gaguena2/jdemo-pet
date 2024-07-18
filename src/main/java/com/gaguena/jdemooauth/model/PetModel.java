package com.gaguena.jdemooauth.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_PET")
@SequenceGenerator(name = "PET_SEQ", sequenceName = "PET_ID_SEQ", initialValue = 1, allocationSize = 1)
public class PetModel {

  @Id
  @Column(name = "ID")
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PET_SEQ")
  private Long id;

  @Column(name = "PET_NAME")
  private String name;

  @ManyToOne
  private AnimalBreedModel breed;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AnimalBreedModel getBreed() {
    return breed;
  }

  public void setBreed(AnimalBreedModel breed) {
    this.breed = breed;
  }

  
}
