package com.example.onlineshop.service;

import com.example.onlineshop.dto.CategoryCreateDto;
import com.example.onlineshop.entity.CategoryEntity;
import java.util.List;
import java.util.Optional;

public interface CategoryService {
    List<CategoryEntity> getAll();
    CategoryEntity getById(Long id);
    CategoryEntity create(CategoryCreateDto categoryCreateDto);
    Optional<CategoryEntity> findByName(String name);
    CategoryEntity edit(Long id, CategoryCreateDto categoryCreateDto);
    void delete(Long id);
}
