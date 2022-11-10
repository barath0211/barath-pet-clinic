package barath.springframework.services;
import barath.springframework.model.Owner;

import java.util.List;

public interface OwnerService extends CrudService<Owner, Long>{
    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);

    Owner findBylastName (String lastName);
}
