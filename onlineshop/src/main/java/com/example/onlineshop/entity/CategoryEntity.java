package com.example.onlineshop.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.List;

@Entity
@Table(name = "category")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<ProductEntity> products;
}
