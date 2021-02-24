package com.example.stock.controller;



import com.example.stock.entity.Sort;
import com.example.stock.service.SortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController

public class SortController {
    @Autowired
    private SortService Ss;

    @GetMapping("/ProductFasort")
    @CrossOrigin
    public List<Sort> findProductSort(String ProductFasort) {


      return Ss.findProductFasort(ProductFasort);


    }



    @GetMapping("/SaveSort")
    @CrossOrigin
 public  void saveSort(Sort sort)
 {   sort.setProductId(UUID.randomUUID().toString());
     Ss.saveSort(sort);


 }








    @GetMapping("/ProductProductId")
    @CrossOrigin
    public List<Sort> findProductId( String ProductId) {


        return Ss.findProductId(ProductId);


    }
















}
