package repository;

import domain.RentalType;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Ethon on 7/27/2016.
 */
public interface RentalRepository extends CrudRepository<RentalType,Long> {
}
