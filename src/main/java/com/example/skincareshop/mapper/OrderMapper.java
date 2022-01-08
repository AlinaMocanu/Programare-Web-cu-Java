package com.example.skincareshop.mapper;

import com.example.skincareshop.domain.Order;
import com.example.skincareshop.dto.OrderDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface OrderMapper {

    @Mapping(target = "total", source = "total")
    @Mapping(target = "placementDate", source = "placementDate")
    @Mapping(target = "id", source = "id")
    @Mapping(target = "user.id", source = "user.id")
    @Mapping(target = "user.lastName", source = "user.lastName")
    @Mapping(target = "user.firstName", source = "user.firstName")
    @Mapping(target = "user.email", source = "user.email")
    @Mapping(target = "user.password", source = "user.password")
    OrderDto mapToDto(Order order);

    @Mapping(target = "total", source = "total")
    @Mapping(target = "placementDate", source = "placementDate")
    @Mapping(target = "id", source = "id")
    @Mapping(target = "user.id", source = "user.id")
    @Mapping(target = "user.lastName", source = "user.lastName")
    @Mapping(target = "user.firstName", source = "user.firstName")
    @Mapping(target = "user.email", source = "user.email")
    @Mapping(target = "user.password", source = "user.password")
    Order mapToEntity(OrderDto order);
}
