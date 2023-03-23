package com.example.provincemanagement.repo;

import com.example.provincemanagement.entity.Province;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProvinceRepository extends JpaRepository<Province, String> {
}
