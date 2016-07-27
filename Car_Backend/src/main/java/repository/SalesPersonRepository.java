package repository;

import domain.SalesPersonType;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Ethon on 7/27/2016.
 */
public interface SalesPersonRepository extends CrudRepository<SalesPersonType,Long> {
}
