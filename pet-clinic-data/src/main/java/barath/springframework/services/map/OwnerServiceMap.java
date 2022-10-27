package barath.springframework.services.map;

import barath.springframework.model.Owner;
import barath.springframework.model.Pet;
import barath.springframework.services.OwnerService;
import barath.springframework.services.PetService;
import barath.springframework.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

    private final PetTypeService petTypeService;
    private final PetService petService;

    public OwnerServiceMap(PetTypeService petTypeService, PetService petService) {
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
        if(object != null){
            if(object.getPets() != null) {
               object.getPets().forEach(pet -> {
                   if (pet.getPetType() != null) {
                       pet.SetPetType(petTypeService.save(pet.getPetType()));
                   }else {
                       throw new RuntimeException("Pet Type is Required");
                   }
                   if(pet.getId() == null) {
                       Pet savedPet = petService.save(pet);
                       pet.setId(savedPet.getId());
                   }
               });
            }
            return super.save(object);
        } else {
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
    public Owner findBylastName(String lastName) {
        return null;
    }
}