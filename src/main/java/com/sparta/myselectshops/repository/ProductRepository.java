package com.sparta.myselectshops.repository;

import com.sparta.myselectshops.dto.ProductResponseDto;
import com.sparta.myselectshops.entity.Product;
import com.sparta.myselectshops.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Page<Product> findAllByUser(User user, Pageable pageable);

    Page<Product> findAllByUserAndProductFolderList_FolderId(User user, Long folderId, Pageable pageable);
}
