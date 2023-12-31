package com.product_seller_system.lawson.model;


import javax.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "purchase")
public class Purchase
{
/*

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column (name="user_id",nullable = false)
    private String userId;


    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="user_id" ,referencedColumnName="id",insertable=false,updatable = false)
    private User user;

    @Column(name="product_id",nullable=false)
    private Long productId;

    @ManyToOne(fetch =FetchType.LAZY)
    @JoinColumn(name="product_id",referencedColumnName="id",insertable=false,updatable = false)
    private Product product;

    @Column(name="price",nullable=false)
    private Double price;


    @Column(name="purchase_time",nullable=false)
    private LocalDateTime purchaseTime;




*/


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id", nullable = false)
    private Long userId;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id", insertable = false, updatable = false)//It is only for foreign key.
    private User user;

    @Column(name = "product_id", nullable = false)
    private Long productId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Product product;

    @Column(name = "price", nullable = false)
    private Double price;

    @Column(name = "purchase_time", nullable = false)

    private LocalDateTime purchaseTime;



}
