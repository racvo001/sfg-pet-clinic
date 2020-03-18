package com.rachit.sfgpetclinic.services.map;

import com.rachit.sfgpetclinic.model.Owner;
import com.rachit.sfgpetclinic.model.Pet;
import com.rachit.sfgpetclinic.services.OwnerService;
import com.rachit.sfgpetclinic.services.PetService;
import com.rachit.sfgpetclinic.services.PetTypeService;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by jt on 7/21/18.
 */

@Service
@Profile({"default","map"})
public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService  {

	private final PetTypeService  petTypeService;
	private final PetService petService;

    public OwnerMapService(PetTypeService petTypeService, PetService petService) {
	this.petTypeService = petTypeService;
	this.petService = petService;
}

	@Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
    	
    	if (object != null)
    	{
    		 if(object.getPets() != null) 
    		 {
    			 object.getPets().forEach(pet->{
    				 if (pet.getPetType() != null) {
    					 if(pet.getPetType().getId() == null)
    					 pet.setPetType(petTypeService.save(pet.getPetType()));
    				 } else
    				 {
    					 throw new RuntimeException("Pet Type is Required");
    				 }
    					
    				 if (pet.getId() == null)
    				 {
    					 Pet savePet = petService.save(pet);
    					 
    					 pet.setId(savePet.getId());
    				 }
    			 });
    		 }
        return super.save( object);
    	} else
    	{
    		return null;
    	}
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

	@Override
	public Owner findByLastName(String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

	

   
}
