package com.example.skincareshop.repository;

import com.example.skincareshop.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findAll();

    Product findProductByName(String Name);

    @Modifying
    @Query(value = "DELETE FROM Product p WHERE p.idProduct = :idProduct")
    void deleteProduct(Long idProduct);

    @Modifying
    @Query(value = "UPDATE Product p SET p.name = :name, p.Price = :price, p.Quantity = :quantity, p.Supplier.id = :supplierId where p.idProduct = :id")
    void updateProduct(Long id, String name, Double price, Long quantity, Long supplierId);

    Product save(Product savedProduct);
}
