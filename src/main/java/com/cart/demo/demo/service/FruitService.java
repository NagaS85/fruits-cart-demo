package com.cart.demo.demo.service;

import com.cart.demo.demo.model.Cart;
import com.cart.demo.demo.model.Fruit;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FruitService {

    public Cart cart = new Cart();

    public List<Fruit> productList(){
         List<Fruit> list = new ArrayList<>();
         list.add( new Fruit(1,"Apple",200.00));
         list.add( new Fruit(2,"Bannana",50.00));
        list.add( new Fruit(3,"PineApple",100.00));
        return list;
    }

    public Cart addRemoveFruit(List<Fruit> fruits){
        /*List<Fruit> fruitsList =  productList();
        String status=null;
        fruits.forEach(fruit -> {
            if(!fruitsList.contains(fruit))
                fruitsList.add(fruit);
            else
                fruitsList.remove(fruit);
        });*/
        cart.setFruitList(fruits);
        return cart;

    }

    public List<Fruit> getFruitList(){
        return  productList();
    }


}
