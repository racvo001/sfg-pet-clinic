package com.rachit.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import com.rachit.sfgpetclinic.model.Pet;


public interface PetRepository extends CrudRepository<Pet,Long> {

}
