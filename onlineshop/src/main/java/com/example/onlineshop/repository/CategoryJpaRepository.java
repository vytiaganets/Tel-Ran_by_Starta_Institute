package com.example.onlineshop.repository;

import com.example.onlineshop.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryJpaRepository extends JpaRepository<CategoryEntity, Long> {
CategoryEntity findByName(String name);
}
