package com.example.onlineshop.service;

import com.example.onlineshop.dto.CategoryCreateDto;
import com.example.onlineshop.entity.CategoryEntity;

import com.example.onlineshop.exceptions.CategoryNotFoundException;
import com.example.onlineshop.mapper.CategoryMapper;
import com.example.onlineshop.repository.CategoryJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService{
    private final CategoryJpaRepository categoryJpaRepository;

    private final CategoryMapper categoryMapper;
@Override
    public List<CategoryEntity> getAll() {
return categoryJpaRepository.findAll();
    }

    public CategoryEntity getById(Long id) {
    return categoryJpaRepository.findById(id).orElseThrow(() ->
            new CategoryNotFoundException("Категория с идентификатором " + id + "не найдено."));
    }
@Override
    public CategoryEntity create(CategoryCreateDto categoryCreateDto) {
        CategoryEntity categoryEntity = categoryMapper.createDtoToEntity(categoryCreateDto);
        CategoryEntity savedEntity =  categoryJpaRepository.save(categoryEntity);
        return savedEntity;
    }
}