package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class PageController {
    @RequestMapping("/InventoryCheck")
    public String inventory(){
        return "/user/InventoryCheck.html";
    }

    @RequestMapping("/receipt")
    public String receipt(){
        return "/user/receiptAll.html";
    }

    @RequestMapping("/payment")
    public String payment(){
        return "/user/payment.html";
    }

    @RequestMapping("/goods")
    public String openGoods() {
        return "/user/goods.html";
    }

    @RequestMapping("/salesreturn")
    public String openSalesreturn() {
        return "/user/salesreturn.html";
    }

        @RequestMapping("/stock")
    public String openStock() {
        return "/user/stock.html";
    }

    @RequestMapping("/sales")
    public String sales() {
        return "/user/Sales.html";
    }

    @RequestMapping("/tpUser")
    public String userPage() {
        return "/user/user.html";
    }

    @RequestMapping("/index")
    public String index() {
        return "/user/index.html";
    }

    @RequestMapping("/tpUrl")
    public String tpUrl(String openUrl) {
        return openUrl;
    }
}
