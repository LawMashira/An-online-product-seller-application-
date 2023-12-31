package com.product_seller_system.lawson.service;

import com.product_seller_system.lawson.model.Product;
import com.product_seller_system.lawson.model.Purchase;
import com.product_seller_system.lawson.repository.ProductRepository;
import com.product_seller_system.lawson.repository.PurchaseRepository;
import com.product_seller_system.lawson.repository.projections.PurchaseItem;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
@Service
public class  PurchaseServiceImpl implements  PurchaseService
{



    private final PurchaseRepository purchaseRepository;

    public PurchaseServiceImpl(PurchaseRepository purchaseRepository)
    {
        this.purchaseRepository = purchaseRepository;
    }

    @Override
    public Purchase savePurchase(Purchase purchase)
    {
        purchase.setPurchaseTime(LocalDateTime.now());

        return purchaseRepository.save(purchase);
    }

    @Override
    public List<PurchaseItem> findPurchaseItemsOfUser(Long userId)
    {
        return purchaseRepository.findAllPurchasesOfUser(userId);
    }

    @Override
    public Product saveProduct(Product product) {
        return null;
    }

    @Override
    public void deleteProduct(Long id) {

    }

    @Override
    public List<Product> findAllProducts() {
        return null;
    }


}
