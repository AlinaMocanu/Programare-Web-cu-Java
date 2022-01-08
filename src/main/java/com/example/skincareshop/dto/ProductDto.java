package com.example.skincareshop.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {
    private Long id;

    private String name;

    private Double price;

    private Long quantity;

    private String supplierName;

    private Long supplierId;

    private String city;
}
