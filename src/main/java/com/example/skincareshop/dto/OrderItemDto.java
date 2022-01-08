package com.example.skincareshop.dto;

import com.example.skincareshop.domain.Order;
import com.example.skincareshop.domain.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderItemDto {

    private Long id;

    private Order order;

    private Product product;

    private Long quantity;
}
