package repository;

import domain.PaymentMethodType;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Ethon on 7/27/2016.
 */
public interface PaymentRepository extends CrudRepository<PaymentMethodType,Long> {
}
