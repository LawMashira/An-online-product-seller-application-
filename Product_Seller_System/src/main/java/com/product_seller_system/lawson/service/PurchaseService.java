package com.product_seller_system.lawson.service;

import com.product_seller_system.lawson.model.Product;
import com.product_seller_system.lawson.model.Purchase;
import com.product_seller_system.lawson.repository.projections.PurchaseItem;

import java.util.List;

public interface PurchaseService {
    Purchase savePurchase(Purchase purchase);


    List<PurchaseItem> findPurchaseItemsOfUser(Long userId);

    Product saveProduct(Product product);

    void deleteProduct(Long id);

    List<Product> findAllProducts();
}
