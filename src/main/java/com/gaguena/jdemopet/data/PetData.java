package com.gaguena.jdemopet.data;

import com.gaguena.jdemopet.model.PetModel;

public record PetData (String code, String name, AnimalBreedData breed) {

  public PetModel to() {
    var model = new PetModel();
    
    return model;
  }
  
  public static PetData create(PetModel model) {
    return new PetData(null);
  }
}
