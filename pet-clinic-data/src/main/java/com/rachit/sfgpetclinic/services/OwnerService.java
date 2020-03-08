package com.rachit.sfgpetclinic.services;


import java.util.List;

import com.rachit.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner,Long> {
	
	
	
	Owner findByLastName(String lastName);
	
	
	
	

}
