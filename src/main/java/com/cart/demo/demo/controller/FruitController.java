package com.cart.demo.demo.controller;

import com.cart.demo.demo.model.Cart;
import com.cart.demo.demo.model.Fruit;
import com.cart.demo.demo.service.FruitService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FruitController {

    private FruitService fruitService;

    public FruitController(FruitService fruitService) {
        this.fruitService = fruitService;
    }

    @PostMapping(value = "/fruit",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public Cart addFruit(@RequestBody List<Fruit> fruits){
       return fruitService.addRemoveFruit(fruits);
    }

    @GetMapping(value = "/fruits",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Fruit> fruitList(){
        return fruitService.getFruitList();
    }


}
