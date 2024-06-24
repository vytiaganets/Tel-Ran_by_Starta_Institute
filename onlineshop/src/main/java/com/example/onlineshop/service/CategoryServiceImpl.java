package com.example.onlineshop.service;

import com.example.onlineshop.configuration.MapperConfiguration;
import com.example.onlineshop.dto.CategoryDto;
import com.example.onlineshop.entity.CategoryEntity;
import com.example.onlineshop.exceptions.CategoryNotFoundException;
import com.example.onlineshop.mapper.Mappers;
import com.example.onlineshop.repository.CategoryJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class CategoryServiceImpl{
    private final CategoryJpaRepository categoryJpaRepository;

    private final Mappers mappers;

    public List<CategoryDto> getCategory() {
        List<CategoryEntity> categoryEntityList = categoryJpaRepository.findAll();
        return MapperConfiguration.convertList(categoryEntityList, mappers::convertToCategoryDto);
    }

    public CategoryDto getCategoryById(Long id) {
        if (!categoryJpaRepository.findById(id).isPresent()) {
            throw new CategoryNotFoundException("the given category was not found");
        }
        return mappers.convertToCategoryDto(categoryJpaRepository.findById(id).orElse(null));
    }

    public void createCategory(CategoryDto categoryDto) {
        CategoryEntity categoryEntity = mappers.convertToCategory(categoryDto);
        categoryEntity.setId(0L);
        categoryJpaRepository.save(categoryEntity);
    }
}