package com.rachit.sfgpetclinic.services.map;

import com.rachit.sfgpetclinic.model.petType;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.rachit.sfgpetclinic.services.CrudService;

import java.util.Set;

/**
 * Created by jt on 7/29/18.
 */
@Service
@Profile({"default", "map"})
public class PetTypeMapService extends AbstractMapService<petType, Long> implements  CrudService<petType, Long> {

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
    public void delete(petType object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
