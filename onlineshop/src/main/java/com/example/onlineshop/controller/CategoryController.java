package com.example.onlineshop.controller;

import com.example.onlineshop.dto.CategoryCreateDto;
import com.example.onlineshop.dto.CategoryDto;
import com.example.onlineshop.entity.CategoryEntity;
import com.example.onlineshop.exceptions.CategoryInvalidArgumentException;
import com.example.onlineshop.exceptions.CategoryNotFoundException;
import com.example.onlineshop.mapper.CategoryMapper;
import com.example.onlineshop.service.CategoryService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/categories")
public class CategoryController {
    private final CategoryService categoryService;
    private final CategoryMapper categoryMapper;

    @GetMapping
    public ResponseEntity<List<CategoryDto>> getAll() {
        List<CategoryDto> categoryDtoList = categoryService.getAll().stream()
                .map(categoryMapper::toDto)
                .collect(Collectors.toList());
        return ResponseEntity.ok(categoryDtoList);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<CategoryDto> getById(@PathVariable Long id) {
        CategoryEntity categoryEntity = categoryService.getById(id);
        return ResponseEntity.ok(categoryMapper.toDto(categoryEntity));
    }

    @PostMapping
    public ResponseEntity<CategoryDto> create(@Valid @RequestBody CategoryCreateDto categoryCreateDto) {
        log.debug("Получен запрос на создание новой категории: {}", categoryCreateDto.getName());
        CategoryEntity createdCategoryEntity = categoryService.create(categoryCreateDto);
        CategoryDto categoryDto = categoryMapper.toDto(createdCategoryEntity);
        log.debug("Категория успешно создана с ID: {}", createdCategoryEntity.getId());
        return ResponseEntity.status(HttpStatus.CREATED).body(categoryDto);
    }
@PutMapping("/{id}")
public ResponseEntity<CategoryDto> edit(@PathVariable Long  id,
                                        @Valid @RequestBody CategoryCreateDto categoryCreateDto){
    log.debug("Получен запрос на редактирование категории с идентификатором: {}", id);
    CategoryEntity updatedCategory = categoryService.edit(id, categoryCreateDto);
    log.debug("Категория с ID: {} успешно обновлена", updatedCategory.getId());
    return ResponseEntity.ok(categoryMapper.toDto(updatedCategory));
}
@DeleteMapping("/{id}")
public ResponseEntity<Void> delete(@PathVariable Long id){
        log.debug("Получен запрос на удаление категории с идентификатором: {}", id);
        categoryService.delete(id);
        log.debug("Категория с ID: {} успешно удалена", id);
        return ResponseEntity.noContent().build();
}
@GetMapping("/search")
public ResponseEntity<CategoryDto> findByName(@RequestParam String name){
        log.debug("Получен запрос на поиск категории по имени: {}", name);
        CategoryEntity categoryEntity = categoryService.findByName(name)
                .orElseThrow(() -> new CategoryNotFoundException("Категория с именем " + name + " не найдено."));
        return ResponseEntity.ok(categoryMapper.toDto(categoryEntity));
}
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(CategoryInvalidArgumentException.class)
    public Map<String, String> handleInvalidArgumentEException(CategoryInvalidArgumentException categoryInvalidArgumentException){
        Map<String,String> map = new HashMap<>();
        map.put("error", categoryInvalidArgumentException.getMessage());
        return map;
    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(CategoryNotFoundException.class)
    public Map<String, String> handlerNotFoundException(CategoryNotFoundException categoryNotFoundException){
        Map<String, String> map = new HashMap<>();
        map.put("error", categoryNotFoundException.getMessage());
        return map;
    }
}
