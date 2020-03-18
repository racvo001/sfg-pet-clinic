package com.rachit.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import com.rachit.sfgpetclinic.model.petType;

public interface PetTypeRepository  extends CrudRepository<petType,Long>  {

}
