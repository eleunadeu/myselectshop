package com.sparta.myselectshops.service;

import com.sparta.myselectshops.dto.ProductRequestDto;
import com.sparta.myselectshops.dto.ProductResponseDto;
import com.sparta.myselectshops.entity.Product;
import com.sparta.myselectshops.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public ProductResponseDto createProduct(ProductRequestDto requestDto) {
        Product product = productRepository.save(new Product(requestDto));
        return new ProductResponseDto(product);
    }
}
