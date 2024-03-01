package com.as.etq.customerproduct.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "book_title")
    private String bookTitle;

    @Column(name = "book_price")
    private BigDecimal bookPrice;

    @Column(name = "book_quantity")
    private Integer bookQuantity;
}
