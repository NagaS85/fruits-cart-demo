package com.cart.demo.demo.controller;

import com.cart.demo.demo.model.Cart;
import com.cart.demo.demo.service.CartService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CartController {

    private CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }



    @PostMapping(value = "/billing",consumes = MediaType.APPLICATION_JSON_VALUE)
    public Double addFruit(@RequestBody Cart  cart){
        return cartService.cartItemsBilling(cart);
    }
}
