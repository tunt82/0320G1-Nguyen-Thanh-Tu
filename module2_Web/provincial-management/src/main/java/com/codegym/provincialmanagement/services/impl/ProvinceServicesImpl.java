package com.codegym.provincialmanagement.services.impl;

import com.codegym.provincialmanagement.model.Province;
import com.codegym.provincialmanagement.repository.ProvinceRepository;
import com.codegym.provincialmanagement.services.ProvinceServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProvinceServicesImpl implements ProvinceServices {
    @Autowired
    private ProvinceRepository provinceRepository;

    @Override
    public Iterable<Province> findAll() {
        return provinceRepository.findAll();
    }

    @Override
    public Province findById(Long id) {
        return provinceRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Province province) {
        provinceRepository.save(province);
    }

    @Override
    public void remove(Long id) {
        provinceRepository.deleteById(id);
    }
}
