package repository;

import domain.VehicleType;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Ethon on 7/27/2016.
 */
public interface VehicleRepository extends CrudRepository<VehicleType,Long> {
}
