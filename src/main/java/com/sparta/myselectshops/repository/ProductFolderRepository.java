package com.sparta.myselectshops.repository;

import com.sparta.myselectshops.entity.Folder;
import com.sparta.myselectshops.entity.Product;
import com.sparta.myselectshops.entity.ProductFolder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductFolderRepository extends JpaRepository<ProductFolder, Long> {
    Optional<ProductFolder> findByProductAndFolder(Product product, Folder folder);
}
