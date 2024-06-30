package backendtech.persistence;
import backendtech.model.CityHistoryOwner;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityHistoryOwnerRepository extends CrudRepository<CityHistoryOwner, Long>  {
}