package com.example.stock.service;

import com.example.stock.dao.SortDao;
import com.example.stock.entity.Sort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SortService {
    @Autowired
    private SortDao SD;


    public List<Sort> findProductFasort(String ProductFasort) {


        return SD.findByProductFasort( ProductFasort);


    }
    public List<Sort> findProductId(String ProductId) {


       return  SD.findByProductId(ProductId);



    }


    public  void  saveSort(Sort sort)
    {
        SD.save(sort);


    }














}
