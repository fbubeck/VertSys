package wwi19b4.bubeck.backend.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import wwi19b4.bubeck.backend.model.Fahrradshop;
import wwi19b4.bubeck.backend.model.Hersteller;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "Hersteller", path="hersteller")
public interface HerstellerRepository extends PagingAndSortingRepository<Hersteller, Long> {
    List<Hersteller> findByNameContains(String name);

}
