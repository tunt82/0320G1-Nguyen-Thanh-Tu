package province_manage.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import province_manage.model.Province;
import province_manage.repository.ProvinceRepository;
import province_manage.service.ProvinceService;

import java.util.List;

@Service
public class ProvinceServiceImpl implements ProvinceService {
    @Autowired
    private ProvinceRepository provinceRepository;

    @Override
    public List<Province> findAllProvince() {
        return provinceRepository.findAll();
    }

}
