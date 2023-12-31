package com.product_seller_system.lawson.model;


import javax.persistence.*;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.Set;

@Data
@Entity
@Table(name = "product")
public class Product
{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Column(name="product_name",nullable=false)

    private String name;

    @Column(name="description",nullable=false)

    private String description;


    @Column(name="price",nullable=false)

    private Double price;

    @Column(name="create_time",nullable=false)

    private LocalDateTime createTime;

   // @OneToMany(fetch = FetchType.LAZY,mappedBy="product")
   // private Set<Purchase> purchaseList;
}
