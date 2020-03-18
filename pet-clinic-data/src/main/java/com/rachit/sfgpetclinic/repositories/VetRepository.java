package com.rachit.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import com.rachit.sfgpetclinic.model.Vet; 

public interface VetRepository  extends CrudRepository<Vet,Long> {

}
