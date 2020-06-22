package com.codegym.provincialmanagement.services;

import com.codegym.provincialmanagement.model.Province;

public interface ProvinceServices {
    Iterable<Province> findAll();

    Province findById(Long id);

    void save(Province province);

    void remove(Long id);
}
