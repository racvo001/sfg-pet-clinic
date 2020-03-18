package com.rachit.sfgpetclinic.services.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.rachit.sfgpetclinic.model.Vet;
import com.rachit.sfgpetclinic.repositories.VetRepository;
import com.rachit.sfgpetclinic.services.VetService;

@Service
@Profile("springdatajpa")
public class VetSDJpaService implements VetService {

	
	 private final VetRepository vetRepository;

	    public VetSDJpaService(VetRepository vetRepository) {
	        this.vetRepository = vetRepository;
	    }

		@Override
		public Set<Vet> findAll() {
			 Set<Vet> vets = new HashSet<>();
		        vetRepository.findAll().forEach(vets::add);
		        return vets;
		}

		@Override
		public Vet findById(Long id) {
			 return vetRepository.findById(id).orElse(null);
		}

		@Override
		public Vet save(Vet Object) {
			 return vetRepository.save(Object);
		}

		@Override
		public void delete(Vet Object) {
			 vetRepository.delete(Object);
			
		}

		@Override
		public void deleteById(Long id) {
			vetRepository.deleteById(id);
			
		}

}
