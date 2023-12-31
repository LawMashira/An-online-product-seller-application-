package com.product_seller_system.lawson.repository;

import com.product_seller_system.lawson.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long>
{
}
