package furama_resort.services.impl;

import furama_resort.models.RentType;
import furama_resort.repositorys.RentTypeRepository;
import furama_resort.services.RentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentTypeServiceImpl implements RentTypeService {
    @Autowired
    RentTypeRepository rentTypeRepository;
    @Override
    public List<RentType> getAllRentType() {
        return rentTypeRepository.findAll();
    }
}
