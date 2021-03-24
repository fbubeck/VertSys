package wwi19b4.bubeck.backend.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import wwi19b4.bubeck.backend.model.Fahrradshop;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "Fahrradshop", path="fahrradshop")
public interface FahrradshopRepository extends PagingAndSortingRepository<Fahrradshop, Long> {

    List<Fahrradshop> findByNameContains(String name);
}
