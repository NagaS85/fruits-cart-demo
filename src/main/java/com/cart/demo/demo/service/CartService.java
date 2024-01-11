package com.cart.demo.demo.service;

import com.cart.demo.demo.model.Cart;
import org.springframework.stereotype.Service;

@Service
public class CartService {

    public Double cartItemsBilling(Cart cart){
        Double totalCost =  cart.getFruitList().stream().map(e->e.getCost()).mapToDouble(e->e.doubleValue()).sum();
        return totalCost;
    }
}
