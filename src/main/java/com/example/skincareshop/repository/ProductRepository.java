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
    @Query(value = "UPDATE Product p SET p.name = :name, p.Price = :price, p.Quantity = :quantity where p.idProduct = :id")
    void updateProduct(Long id, String name, Double price, Long quantity);

   /* @Modifying
    @Query(value = "UPDATE Product p SET p.name = :prod.name where p.idProduct = :id")
    void updateProduct(Product prod, Long id);*/


}
