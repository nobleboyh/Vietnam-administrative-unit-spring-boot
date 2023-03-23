package com.example.provincemanagement.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Table(name = "provinces")
@Data
public class Province {
    @Id
    @Column(name = "code")
    String code;

    @Column(name = "name")
    String name;

    @Column(name = "full_name")
    String fullName;
}
