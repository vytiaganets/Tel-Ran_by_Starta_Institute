package com.example.onlineshop.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
@Entity
@Table(name = "Products")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ProductID")
    private Long id;
    @Column(name = "Name")
    private String name;
    @Column(name = "Description")
    private String description;
    @Column(name = "Price")
    private BigDecimal price;
    @Column(name = "ImageURL")
    private String image;
    @Column(name = "DiscountPrice")
    private BigDecimal discountPrice;
    @Column(name = "CreatedAt")
    private LocalDateTime createdAt = LocalDateTime.now();
    @Column(name = "UpdatedAt")
    private LocalDateTime updatedAt = LocalDateTime.now();
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CategoryID")
    private CategoryEntity category;
}
