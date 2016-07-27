package repository;

import domain.LoginEmbeddableType;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Ethon on 7/27/2016.
 */
public interface LoginRepository extends CrudRepository<LoginEmbeddableType,Long> {
}
