package com.example.provincemanagement.repo;

import com.example.provincemanagement.entity.District;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DistrictRepository extends JpaRepository<District, String> {
    List<District> findAllByProvinceCode(String code);
}
