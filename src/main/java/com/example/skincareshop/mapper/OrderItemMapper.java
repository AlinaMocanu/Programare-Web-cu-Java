package com.example.skincareshop.mapper;

import com.example.skincareshop.domain.OrderItem;
import com.example.skincareshop.dto.OrderItemDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface OrderItemMapper {
    @Mapping(target = "order.total", source = "order.total")
    @Mapping(target = "order.placementDate", source = "order.placementDate")
    @Mapping(target = "order.id", source = "order.id")
    @Mapping(target = "product.id", source = "product.id")
    @Mapping(target = "product.name", source = "product.name")
    @Mapping(target = "product.price", source = "product.price")
    @Mapping(target = "product.quantity", source = "product.quantity")
    @Mapping(target = "id", source = "id")
    @Mapping(target = "quantity", source = "quantity")
    OrderItemDto mapToDto(OrderItem orderItem);

    @Mapping(target = "order.total", source = "order.total")
    @Mapping(target = "order.placementDate", source = "order.placementDate")
    @Mapping(target = "order.id", source = "order.id")
    @Mapping(target = "product.id", source = "product.id")
    @Mapping(target = "product.name", source = "product.name")
    @Mapping(target = "product.price", source = "product.price")
    @Mapping(target = "product.quantity", source = "product.quantity")
    @Mapping(target = "id", source = "id")
    @Mapping(target = "quantity", source = "quantity")
    OrderItem mapToEntity(OrderItemDto orderItem);
}
