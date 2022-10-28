package barath.springframework.bootstrap;

import barath.springframework.model.*;
import barath.springframework.services.OwnerService;
import barath.springframework.services.PetTypeService;
import barath.springframework.services.SpecialityService;
import barath.springframework.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

import static barath.springframework.model.Speciality.savedRadiology;
import static barath.springframework.model.Speciality.savedSurgery;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialityService specialityService;


    public DataLoader(OwnerService ownerService, VetService vetService,
                      PetTypeService petTypeService, SpecialityService specialityService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialityService = specialityService;
    }

    @Override
    public void run(String... args) throws Exception {

        int count = petTypeService.findAll().size();
        if (count == 0) {
        localData();
        }
    }
    private void localData() {
        PetType dog = new PetType();
        dog.setName("Dog");
        PetType saveDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("Cat");
        PetType saveCatPetType = petTypeService.save(cat);

        Speciality radiology = new Speciality();
        radiology.setDescription("Radiology");
        savedRadiology = specialityService.save(radiology);

        Speciality surgery = new Speciality();
        radiology.setDescription("Surgery");
        Speciality.savedSurgery = specialityService.save(radiology);

        Speciality dentistry = new Speciality();
        radiology.setDescription("Dentistry");
        Speciality.savedDentistry = specialityService.save(radiology);


        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAddress("123 nagar");
        owner1.setCity("Miami");
        owner1.setTelephone("879639833");
        Pet mikesPet = new Pet();
        mikesPet.setPetType(saveDogPetType);
        mikesPet.setOwner(owner1);
        mikesPet.setBirthDate(LocalDate.now());
        mikesPet.setName("Rosco");
        owner1.getPets().add(mikesPet);
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        owner1.setAddress("123 nagar");
        owner1.setCity("Miami");
        owner1.setTelephone("879639853");
        Pet fionasCat = new Pet();
        fionasCat.setName("just Cat");
        fionasCat.setOwner(owner2);
        fionasCat.setBirthDate(LocalDate.now());
        fionasCat.setPetType(saveCatPetType);
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