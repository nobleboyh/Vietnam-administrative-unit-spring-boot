package com.example.provincemanagement.controller;

import com.example.provincemanagement.dto.DistrictDTO;
import com.example.provincemanagement.dto.ProvinceDTO;
import com.example.provincemanagement.dto.WardDTO;
import com.example.provincemanagement.service.IAdministrativeUnitService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/administrative")
@RequiredArgsConstructor
public class AdministrativeUnitController {

    private final IAdministrativeUnitService administrativeUnitService;

    @GetMapping(path = "/provinces")
    public ResponseEntity<List<ProvinceDTO>> getAllProvinces(){
        return ResponseEntity.ok(administrativeUnitService.getAllProvinces());
    }


    @GetMapping(path = "/districts")
    public ResponseEntity<List<DistrictDTO>> getDistrictsByProvince(@RequestParam String provinceId){
        return ResponseEntity.ok(administrativeUnitService.getDistrictsByProvince(provinceId));
    }

    @GetMapping(path = "/wards")
    public ResponseEntity<List<WardDTO>> getWardsByProvinceAndDistrict( @RequestParam String districtId){
        return ResponseEntity.ok(administrativeUnitService.getWardsByProvinceAndDistrict(districtId));
    }
}
