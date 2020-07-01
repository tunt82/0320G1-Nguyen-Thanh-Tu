package furama_resort.services;

import furama_resort.models.Customer;
import furama_resort.models.Quantity;
import furama_resort.models.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Map;

public interface ServiceService {

    Page<Service> findAllService(Pageable pageable,String s,String type);
    List<Service> getAllService();

    void saveService(Service service);

    Map<Service,Quantity> findById(Long id, Map<Service, Quantity> bookService);
}
