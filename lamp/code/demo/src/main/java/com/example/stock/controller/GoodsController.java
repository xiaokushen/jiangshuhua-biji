package com.example.stock.controller;


import com.example.stock.entity.Goods;
import com.example.stock.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
public class GoodsController {
    @Autowired
    private GoodsService Gs;

    @GetMapping("/ProductId")
    @CrossOrigin
    public List<Goods> findProductId(String ProductId) {

     System.out.println(ProductId);
        return Gs.findProductId(ProductId);


    }




    @GetMapping("/ProductName")
    @CrossOrigin
    public List<Goods> findProductName(String ProductName) {

    return  Gs.findProductName(ProductName);



    }





    @GetMapping("/findAllGoods")
    @CrossOrigin
    public List<Goods> findall() {


        return  Gs.findAllGoods();


    }

    @GetMapping("/SaveGood")
    @CrossOrigin
    @ResponseBody
    public void SaveGood(Goods goods) {

       goods.setWaregoodsId(UUID.randomUUID().toString());
       goods.setDeletState("1");
      Gs.saveGood(goods);


    }



    @GetMapping("/WaregoodsId")
    @CrossOrigin
    public List<Goods> findWaregoodsId(String WaregoodsId) {

        return  Gs.findWaregoodsId(WaregoodsId);



    }

    @GetMapping("/DelGood")
    @CrossOrigin
    public void delByWaregoodsId(String WaregoodsId) {

      Gs.delgood(WaregoodsId);



    }


}
