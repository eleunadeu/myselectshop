package com.sparta.myselectshops.repository;

import com.sparta.myselectshops.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
