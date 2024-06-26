package com.example.onlineshop.service;

import com.example.onlineshop.dto.CategoryCreateDto;
import com.example.onlineshop.entity.CategoryEntity;

import com.example.onlineshop.exceptions.CategoryInvalidArgumentException;
import com.example.onlineshop.exceptions.CategoryNotFoundException;
import com.example.onlineshop.mapper.CategoryMapper;
import com.example.onlineshop.repository.CategoryJpaRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Slf4j
@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService{
    private final CategoryJpaRepository categoryJpaRepository;

    private final CategoryMapper categoryMapper;
@Override
    public List<CategoryEntity> getAll() {
    log.debug("Получение всех категорий.");
    return categoryJpaRepository.findAll();
    }
@Override
    public CategoryEntity getById(Long id) {
    log.debug("Получение категории по идентификатору: {}", id);
    return categoryJpaRepository.findById(id).orElseThrow(() ->
            new CategoryNotFoundException("Категория с идентификатором " + id + "не найдено."));
    }
@Override
    public CategoryEntity create(CategoryCreateDto categoryCreateDto) {
    log.debug("Создание категории с именем: {}", categoryCreateDto.getName());
        CategoryEntity categoryEntity = categoryMapper.createDtoToEntity(categoryCreateDto);
        CategoryEntity savedEntity =  categoryJpaRepository.save(categoryEntity);
        return savedEntity;
    }

    @Override
    public Optional<CategoryEntity> findByName(String name) {
        log.debug("Поиск категории по названию: {}", name);
        return categoryJpaRepository.findByName(name);
    }

    @Override
    public CategoryEntity edit(Long id, CategoryCreateDto categoryCreateDto) {
    log.debug("Редактирование категории с идентификатором: {}", id);
    return categoryJpaRepository.findById(id).map(category -> {
        category.setName(categoryCreateDto.getName());
        CategoryEntity updateCategory = categoryJpaRepository.save(category);
        log.debug("Категория с идентификатором: {} успешно обновлена", id);
        return updateCategory;
    }).orElseThrow(() -> {
        log.error("Категория с идентификатором {} не найдена для обновления", id);
        return new CategoryNotFoundException("Категория с идентификатором " + id + " не найдена.");
    });
    }

    @Override
    public void delete(Long id) {
    log.debug("Удаление категории с идентификатором: {}", id);
    if(!categoryJpaRepository.existsById(id)){
        log.error("Категория с идентификатором {} не найдена для удаления", id);
        throw new CategoryInvalidArgumentException("Категория не найдена.");
    }
    categoryJpaRepository.deleteById(id);
    log.debug("Категория с ID: {} успешно удалена", id);
    }
}