package com.gaguena.jdemooauth.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_ANIMAL_BREED")
@SequenceGenerator(name = "ANIMAL_BREED_SEQ", sequenceName = "ANIMAL_BREED_ID_SEQ", initialValue = 1, allocationSize = 1)
public class AnimalBreedModel {

  @Id
  @Column(name = "ID")
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ANIMAL_BREED_SEQ")
  private Long id;

  @Column(name = "BREED_CODE", nullable = false)
  private Long code;

  @Column(name = "BREED_NAME", nullable = false)
  private String name;
}
