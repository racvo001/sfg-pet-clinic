package com.rachit.sfgpetclinic.services;


import com.rachit.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner,Long> {
	
	
	
	Owner findByLastName(String lastName);
	
	

}
