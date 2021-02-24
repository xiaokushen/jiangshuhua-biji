package com.example.inventory.controller;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller

public class Controller {

    @RequestMapping("/InventoryCheck")
    public String inventory(){
        return "receipt/InventoryCheck.html";
    }

    @RequestMapping("/receipt")
    public String receipt(){
        return "receipt/receiptAll.html";
    }

    @RequestMapping("/payment")
    public String payment(){
        return "receipt/payment.html";
    }
}