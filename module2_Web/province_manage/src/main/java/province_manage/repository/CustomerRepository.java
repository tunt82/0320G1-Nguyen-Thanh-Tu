package province_manage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import province_manage.model.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
