package com.rachit.sfgpetclinic.services;

import java.util.Set;

import com.rachit.sfgpetclinic.model.Owner;

public interface OwnerService {
	
	Owner findById(Long id);
	
	Owner save(Owner owner);
	
	Set<Owner> findAll();

}
