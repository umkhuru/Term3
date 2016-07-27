package repository;

import domain.VehicleConditionEmbeddableType;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Ethon on 7/27/2016.
 */
public interface VehicleConditionEmbeddableRepository extends CrudRepository<VehicleConditionEmbeddableType,Long> {
}
