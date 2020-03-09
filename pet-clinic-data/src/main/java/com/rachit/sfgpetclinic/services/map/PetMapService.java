package com.rachit.sfgpetclinic.services.map;

import com.rachit.sfgpetclinic.model.Pet;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.rachit.sfgpetclinic.services.PetService;

import java.util.Set;

/**
 * Created by jt on 7/21/18.
 */


@Service
public class PetMapService extends AbstractMapService<Pet, Long> implements  PetService {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save( object);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
