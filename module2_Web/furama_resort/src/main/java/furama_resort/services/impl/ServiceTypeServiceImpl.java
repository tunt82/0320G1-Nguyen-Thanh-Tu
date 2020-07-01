package furama_resort.services.impl;

import furama_resort.models.ServiceType;
import furama_resort.repositorys.ServiceTypeRepository;
import furama_resort.services.ServiceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceTypeServiceImpl implements ServiceTypeService {
    @Autowired
    ServiceTypeRepository serviceTypeRepository;
    @Override
    public List<ServiceType> getAllServiceType() {
        return serviceTypeRepository.findAll();
    }
}
