package barath.springframework.services;
import barath.springframework.model.Pet;
import java.util.Set;


public interface PetService {
    Pet findById(Long Id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
