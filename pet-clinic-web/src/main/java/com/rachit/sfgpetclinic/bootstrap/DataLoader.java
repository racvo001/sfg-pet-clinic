package com.rachit.sfgpetclinic.bootstrap;




import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.rachit.sfgpetclinic.model.Owner;
import com.rachit.sfgpetclinic.model.Pet;
import com.rachit.sfgpetclinic.model.Speciality;
import com.rachit.sfgpetclinic.model.Vet;
import com.rachit.sfgpetclinic.model.petType;
import com.rachit.sfgpetclinic.services.OwnerService;
import com.rachit.sfgpetclinic.services.PetTypeService;
import com.rachit.sfgpetclinic.services.SpecialtyService;
import com.rachit.sfgpetclinic.services.VetService;


@Component
public class DataLoader implements CommandLineRunner {

   
	private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialtyService specialtyService;
    
	  public DataLoader(OwnerService ownerService, VetService vetService,PetTypeService petTypeService,SpecialtyService specialtyService) {
	  
	  this.specialtyService = specialtyService;
	  this.ownerService = ownerService; 
	  this.vetService = vetService;
	  this.petTypeService = petTypeService;
	  
	  }
	 

	@Override
    public void run(String... args) throws Exception {
  
		int count = petTypeService.findAll().size();

        if (count == 0 ){
            loadData();
        }
    }


	private void loadData() {
		petType dog =new petType();
		dog.setName("Dog");
		
		petType savedDogpetType = petTypeService.save(dog);
		
		petType cat =new petType();
		cat.setName("Cat");
		
		petType savedCatpetType = petTypeService.save(cat);
		
		
		Speciality radiology = new Speciality();
        radiology.setDescription("Radiology");
        Speciality savedRadiology = specialtyService.save(radiology);

        Speciality surgery = new Speciality();
        surgery.setDescription("Surgery");
        Speciality savedSurgery = specialtyService.save(surgery);

        Speciality dentistry = new Speciality();
        dentistry.setDescription("dentistry");
        Speciality savedDentistry = specialtyService.save(dentistry);


		 Owner owner1 = new Owner();
	        owner1.setFirstName("Michael");
	        owner1.setLastName("Weston");
	        owner1.setAddress("123 Brickerel");
	        owner1.setCity("Miami");
	        owner1.setTelephone("1231231234");

	        Pet mikesPet = new Pet();
	        mikesPet.setPetType(savedDogpetType);
	        mikesPet.setOwner(owner1);
	        mikesPet.setBirthDate(LocalDate.now());
	        mikesPet.setName("Rosco");
	        owner1.getPets().add(mikesPet);

	        ownerService.save(owner1);

	        Owner owner2 = new Owner();
	        owner2.setFirstName("Fiona");
	        owner2.setLastName("Glenanne");
	        owner2.setAddress("123 Brickerel");
	        owner2.setCity("Miami");
	        owner2.setTelephone("1231231234");

	        Pet fionasCat = new Pet();
	        fionasCat.setName("Just Cat");
	        fionasCat.setOwner(owner2);
	        fionasCat.setBirthDate(LocalDate.now());
	        fionasCat.setPetType(savedCatpetType);
	        owner2.getPets().add(fionasCat);
        

        ownerService.save(owner2);

        
        System.out.println("Loaded Owners....");

        Vet vet1 = new Vet();

        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        vet1.getSpecialities().add(savedRadiology);

        vetService.save(vet1);

        Vet vet2 = new Vet();

        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");
        vet2.getSpecialities().add(savedSurgery);

        vetService.save(vet2);

        System.out.println("Loaded Vets....");
	}
}