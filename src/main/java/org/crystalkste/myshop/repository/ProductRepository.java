package org.crystalkste.myshop.repository;

import org.crystalkste.myshop.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByCategoryName(String categoryName);
    List<Product> findByCategoryNameAndId(String categoryName, Long id);
}