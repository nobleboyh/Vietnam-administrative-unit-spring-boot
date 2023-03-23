package com.example.provincemanagement.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "wards")
@Data
public class Ward {
    @Id
    @Column(name = "code")
    String code;

    @Column(name = "name")
    String name;

    @Column(name = "full_name")
    String fullName;

    @Column(name = "district_code")
    String districtCode;
}
