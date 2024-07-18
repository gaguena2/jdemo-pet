package com.gaguena.jdemopet.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.gaguena.jdemopet.model.PetModel;

@Repository
public interface PetRepository extends PagingAndSortingRepository<PetModel, Long>{

}
