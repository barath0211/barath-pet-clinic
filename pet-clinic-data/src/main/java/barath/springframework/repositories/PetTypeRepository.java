package barath.springframework.repositories;

import barath.springframework.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository <PetType, Long> {
}
