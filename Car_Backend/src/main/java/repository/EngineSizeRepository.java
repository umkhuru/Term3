package repository;

import domain.EngineSizeEmbeddableType;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Ethon on 7/27/2016.
 */
public interface EngineSizeRepository extends CrudRepository<EngineSizeEmbeddableType,Long> {
}
