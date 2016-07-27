package repository;

import domain.AddressEmbeddableType;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Ethon on 7/27/2016.
 */
public interface AddressRepository extends CrudRepository<AddressEmbeddableType,Long> {
}
