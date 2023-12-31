package com.product_seller_system.lawson.service;

import com.product_seller_system.lawson.model.Product;

import java.util.List;

public interface ProductService {
    Product saveProduct(Product product);

    void deleteProduct(Long id);

    List<Product> findAllProducts();
}
