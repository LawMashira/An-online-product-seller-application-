package com.product_seller_system.lawson.service;

import com.product_seller_system.lawson.model.User;

public interface AuthenticationService
{


    User signInAndReturnJWT(User signInRequest);
}

