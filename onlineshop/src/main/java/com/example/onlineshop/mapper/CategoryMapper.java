package com.example.onlineshop.mapper;

import com.example.onlineshop.dto.CategoryCreateDto;
import com.example.onlineshop.dto.CategoryDto;
import com.example.onlineshop.entity.CategoryEntity;

public interface CategoryMapper {
    CategoryDto toDto(CategoryEntity entity);
    CategoryEntity toEntity(CategoryDto dto);
    CategoryEntity createDtoToEntity(CategoryCreateDto categoryCreateDto);
}
