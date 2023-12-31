package com.product_seller_system.lawson.repository.projections;

import java.time.LocalDateTime;

public interface PurchaseItem
{
    String getName();
    Double getPrice();
    LocalDateTime getPurchaseTime();
}

