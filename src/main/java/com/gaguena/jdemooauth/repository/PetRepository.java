package com.gaguena.jdemooauth.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.gaguena.jdemooauth.model.PetModel;

@Repository
public interface PetRepository extends PagingAndSortingRepository<PetModel, Long>{

}
