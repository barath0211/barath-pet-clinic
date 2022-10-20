package barath.springframework.services;

import barath.springframework.model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findBylastName (String lastName);
    Owner findById(Long Id);
    Owner save(Owner owner);
    Set<Owner> findAll();

}
