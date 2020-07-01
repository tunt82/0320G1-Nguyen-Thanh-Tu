package furama_resort.services.impl;

import furama_resort.models.Quantity;
import furama_resort.models.Service;
import furama_resort.repositorys.ServiceRepository;
import furama_resort.services.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class ServiceServiceImpl implements ServiceService {
    @Autowired
    ServiceRepository serviceRepository;
    @Override
    public Page<Service> findAllService(Pageable pageable,String s,String type) {
        return serviceRepository.findAllByNameServiceContainingAndAndStatusContaining(pageable,s,type);
    }

    @Override
    public List<Service> getAllService() {
        return serviceRepository.findAll();
    }

    @Override
    public void saveService(Service service) {
        serviceRepository.save(service);
    }

    @Override
    public Map<Service, Quantity> findById(Long id, Map<Service, Quantity> bookService) {
        if(bookService.size()!=0 ){
            for(Service service:bookService.keySet()) {
                if(service.getIdService().equals(id)){
                    bookService.get(service).increment();
                    return bookService;
                }
            }
        }
        bookService.put(serviceRepository.findById(id).orElse(null), new Quantity(1));
        return bookService;
    }

}
