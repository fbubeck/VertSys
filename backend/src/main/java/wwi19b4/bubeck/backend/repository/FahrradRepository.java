package wwi19b4.bubeck.backend.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import wwi19b4.bubeck.backend.model.Fahrrad;
import wwi19b4.bubeck.backend.model.Fahrradshop;

import java.util.List;

//Repository Interface  für Fahrräder
@RepositoryRestResource(collectionResourceRel = "Fahrrad", path="fahrrad")
public interface FahrradRepository extends PagingAndSortingRepository<Fahrrad, Long> {
    List<Fahrrad> findByModellContains(String modell);

}
