package com.product_seller_system.lawson.service;

import com.product_seller_system.lawson.model.User;
import com.product_seller_system.lawson.security.UserPrinciple;
import com.product_seller_system.lawson.security.jwt.JwtProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationServiceImpl implements  AuthenticationService
{
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private JwtProvider jwtProvider;
    @Override
    public User  signInAndReturnJWT(User signInRequest)
    {
        Authentication authentication = authenticationManager.authenticate(

          new UsernamePasswordAuthenticationToken(signInRequest.getUsername(),signInRequest.getPassword())
        );

        UserPrinciple userPrinciple = (UserPrinciple) authentication.getPrincipal();
        String jwt = jwtProvider.generateToken(userPrinciple);
        User signInUser =userPrinciple.getUser();
        signInUser.setToken(jwt);
        return  signInUser;
    }

}
