package repository;

import domain.VehicleConditionType;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Ethon on 7/27/2016.
 */
public interface VehicleConditionRepository extends CrudRepository<VehicleConditionType,Long> {
}
