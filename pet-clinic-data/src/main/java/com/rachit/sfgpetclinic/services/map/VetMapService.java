package com.rachit.sfgpetclinic.services.map;


import com.rachit.sfgpetclinic.model.Vet;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.rachit.sfgpetclinic.services.VetService;

import java.util.Set;

/**
 * Created by jt on 7/21/18.
 */


@Service
public class VetMapService extends AbstractMapService<Vet, Long> implements  VetService {

    

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save( object);
    }


    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
