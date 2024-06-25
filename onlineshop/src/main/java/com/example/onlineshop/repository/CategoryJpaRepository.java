package com.example.onlineshop.repository;

import com.example.onlineshop.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CategoryJpaRepository extends JpaRepository<CategoryEntity, Long> {
    //CategoryEntity findByName(String name);
    Optional<CategoryEntity> findByName(String name);
}
