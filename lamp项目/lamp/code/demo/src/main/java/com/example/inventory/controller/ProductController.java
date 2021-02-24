package com.example.inventory.controller;

import com.example.inventory.entity.Product;
import com.example.inventory.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {


    @Autowired
    private ProductService us;

    @GetMapping("/findOnePro")
    @CrossOrigin
    public List<Product> findProduct(String prolistID) {

        return us.findByName(prolistID);

    }
}
