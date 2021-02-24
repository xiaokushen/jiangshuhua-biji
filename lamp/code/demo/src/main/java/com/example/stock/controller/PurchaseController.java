package com.example.stock.controller;


import com.example.stock.entity.Purchase;
import com.example.stock.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
public class PurchaseController {
    @Autowired
    private PurchaseService Ps;
    @GetMapping("/findOpe")
    @CrossOrigin
    public List<Purchase> findOpe(String OperatorID) {
        return Ps.findOpe(OperatorID);
    }
    @GetMapping("/findSales")
    @CrossOrigin
    public List<Purchase> findSales(String OperatorID) {


        return Ps.findSaleOpe(OperatorID);


    }





    @GetMapping("/findAllOpe")
    @ResponseBody
    @CrossOrigin
    public List<Purchase> findAllOpe() {


        return Ps.findAllOpe();


    }

    @GetMapping("/findSaleAllOpe")
    @ResponseBody
    @CrossOrigin
    public List<Purchase> findSaleAllOpe() {


        return Ps.findSaleAllOpe();


    }





    @GetMapping("/findOpeOrderId")
    @CrossOrigin
    public List<Purchase> findOpeOrderId(String OrderId) {

  System.out.println(OrderId);
        return Ps.findOpeOrderId(OrderId);


    }







    @GetMapping("/SaveOpe")
    @CrossOrigin
    @ResponseBody
    public void SaveOpe(Purchase purchase) {

       purchase.setRowId(UUID.randomUUID().toString());
       purchase.setDeletState("1");
       purchase.setAppRovalState("1");
      Ps.SaveOpe(purchase);


    }

    @GetMapping("/SaveSales")
    @CrossOrigin
    @ResponseBody
    public void SaveSales(Purchase purchase) {

        purchase.setRowId(UUID.randomUUID().toString());
        purchase.setDeletState("1");
        purchase.setAppRovalState("0");
        Ps.SaveOpe(purchase);


    }




    @GetMapping("/DelOpe")
    @CrossOrigin
    public void deleteOpe(String OrderId)
    {
        Ps.DelOpe(OrderId);


    }

    @GetMapping("/UpdateOpe")
    @CrossOrigin
    @ResponseBody
    public void UpdateOpe(Purchase purchase)
    {
       Ps.UpdateOpe(purchase);


    }





}
