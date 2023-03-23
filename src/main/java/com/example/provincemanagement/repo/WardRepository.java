package com.example.provincemanagement.repo;

import com.example.provincemanagement.entity.Ward;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WardRepository extends JpaRepository<Ward, String> {
    List<Ward> findAllByDistrictCode(String districtCode);
}
