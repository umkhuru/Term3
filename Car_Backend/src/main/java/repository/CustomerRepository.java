package repository;

import domain.CustomerType;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Ethon on 7/27/2016.
 */
public interface CustomerRepository extends CrudRepository<CustomerType,Long> {
}
