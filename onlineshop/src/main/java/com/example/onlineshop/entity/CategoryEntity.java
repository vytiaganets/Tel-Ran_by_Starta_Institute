package com.example.onlineshop.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Table(name = "Categories")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "category",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<ProductEntity> products;
}
