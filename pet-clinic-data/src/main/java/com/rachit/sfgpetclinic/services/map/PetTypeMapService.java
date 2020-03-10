package com.rachit.sfgpetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.rachit.sfgpetclinic.model.petType;
import com.rachit.sfgpetclinic.services.PetTypeService;

@Service
public class PetTypeMapService extends AbstractMapService<petType, Long> implements  PetTypeService {

	@Override
	public Set<petType> findAll() {
	
		return super.findAll();
	}

	@Override
	public petType findById(Long id) {
		
		return super.findById(id);
	}

	@Override
	public petType save(petType object) {
		
		return super.save(object);
	}

	@Override
	public void deleteById(Long id) {

		super.deleteById(id);
	}

	@Override
	public void delete(petType object) {
		
		super.delete(object);
	}

}
