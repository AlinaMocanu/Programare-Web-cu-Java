package com.example.skincareshop.mapper;

import com.example.skincareshop.domain.Product;
import com.example.skincareshop.dto.ProductDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    @Mapping(target = "SupplierName", source = "supplier.name")
    @Mapping(target = "City", source = "supplier.city")
    @Mapping(target = "Name", source = "name")
    @Mapping(target = "Price", source = "price")
    @Mapping(target = "id", source = "idProduct")
    @Mapping(target = "Quantity", source = "quantity")
    ProductDto mapToDto(Product product);

    @Mapping(target = "Supplier.Name", source = "supplierName")
    @Mapping(target = "Supplier.City", source = "city")
    @Mapping(target = "name", source = "name")
    @Mapping(target = "Price", source = "price")
    @Mapping(target = "Quantity", source = "quantity")
    @Mapping(target = "idProduct", source = "id")
    Product mapToEntity(ProductDto product);
}
