package barath.springframework.services;
import barath.springframework.model.Vet;
import java.util.Set;



public interface VetService {
    Vet findById(Long Id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
