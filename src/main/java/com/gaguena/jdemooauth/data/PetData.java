package com.gaguena.jdemooauth.data;

import com.gaguena.jdemooauth.model.PetModel;

public record PetData (String code, String name, AnimalBreedData breed) {

  public PetModel to() {
    var model = new PetModel();
    
    return model;
  }
  
  public static PetData create(PetModel model) {
    return new PetData(null);
  }
}
