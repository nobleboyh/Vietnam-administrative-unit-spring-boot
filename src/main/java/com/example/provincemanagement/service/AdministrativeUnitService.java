package com.example.provincemanagement.service;

import com.example.provincemanagement.dto.DistrictDTO;
import com.example.provincemanagement.dto.ProvinceDTO;
import com.example.provincemanagement.dto.WardDTO;
import com.example.provincemanagement.repo.DistrictRepository;
import com.example.provincemanagement.repo.ProvinceRepository;
import com.example.provincemanagement.repo.WardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AdministrativeUnitService implements IAdministrativeUnitService{

    private final ProvinceRepository provinceRepository;

    private final DistrictRepository districtRepository;

    private final WardRepository wardRepository;

    @Override
    public List<ProvinceDTO> getAllProvinces() {
        return provinceRepository.findAll().stream().map(
            p -> new ProvinceDTO(p.getCode(), p.getName(), p.getFullName())
        ).collect(Collectors.toList());
    }

    @Override
    public List<DistrictDTO> getDistrictsByProvince(String provinceId) {
        return districtRepository.findAllByProvinceCode(provinceId).stream().map(
                p -> new DistrictDTO(p.getCode(), p.getName(), p.getFullName())
        ).collect(Collectors.toList());
    }

    @Override
    public List<WardDTO> getWardsByProvinceAndDistrict(String districtId) {
        return wardRepository.findAllByDistrictCode(districtId).stream().map(
                p -> new WardDTO(p.getCode(), p.getName(), p.getFullName())
        ).collect(Collectors.toList());
    }
}
