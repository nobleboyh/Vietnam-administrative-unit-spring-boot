package com.example.provincemanagement.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "districts")
@Data
public class District {
    @Id
    @Column(name = "code")
    String code;

    @Column(name = "name")
    String name;

    @Column(name = "full_name")
    String fullName;

    @Column(name = "province_code")
    String provinceCode;
}
