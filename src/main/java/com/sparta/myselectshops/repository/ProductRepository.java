package com.sparta.myselectshops.repository;

import com.sparta.myselectshops.entity.Product;
import com.sparta.myselectshops.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findAllByUser(User user);
}
