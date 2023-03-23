package com.example.provincemanagement.service;

import com.example.provincemanagement.dto.DistrictDTO;
import com.example.provincemanagement.dto.ProvinceDTO;
import com.example.provincemanagement.dto.WardDTO;

import java.util.List;

public interface IAdministrativeUnitService {
    List<ProvinceDTO> getAllProvinces();

    List<DistrictDTO> getDistrictsByProvince(String provinceId);

    List<WardDTO> getWardsByProvinceAndDistrict(String districtId);
}
