package barath.springframework.repositories;

import barath.springframework.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
    Owner findByLastName(String lastname);

}
