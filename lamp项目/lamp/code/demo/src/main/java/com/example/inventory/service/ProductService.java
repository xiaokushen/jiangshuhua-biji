package com.example.inventory.service;


import com.example.inventory.dao.ProductDao;
import com.example.inventory.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductDao dao;

    public List<Product> findByName(String prolistID)
    {
        return dao.findProductByName(prolistID);

    }


}
