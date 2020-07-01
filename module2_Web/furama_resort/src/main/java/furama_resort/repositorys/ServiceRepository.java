package furama_resort.repositorys;

import furama_resort.models.Customer;
import furama_resort.models.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRepository extends JpaRepository<Service,Long> {
    Page<Service> findAllByNameServiceContainingAndAndStatusContaining(Pageable pageable,String s,String type);
}
