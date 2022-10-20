package barath.springframework.services;
import barath.springframework.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{
    Owner findBylastName (String lastName);
}
