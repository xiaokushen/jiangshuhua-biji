package com.example.stock.service;


import com.example.stock.dao.GoodsDao;
import com.example.stock.entity.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GoodsService {
    @Autowired
    private GoodsDao Gd;



    public List<Goods> findProductId(String ProductId) {


        return Gd.findByProductId( ProductId);


    }
    public List<Goods> findAllGoods() {


        return Gd.findallByProductId();


    }

    public List<Goods> findProductName(String ProductName) {

return  Gd.findByProductName(ProductName);



    }


    public void saveGood(Goods goods) {

     Gd.save(goods);



    }

    public List<Goods> findWaregoodsId(String WaregoodsId) {


        return Gd.findByWaregoodsId(WaregoodsId);


    }

    @Transactional
    public void  delgood(String WaregoodsId)
    {

        Gd.delByWaregoodsId(WaregoodsId);


    }













}
