package com.example.salesSlip.controller;

import com.example.salesSlip.entity.Sales;
import com.example.salesSlip.service.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
public class SalesController {
    @Autowired
    SalesService ss;


    @RequestMapping("/querySalesById")
    @ResponseBody
    public List<Sales> querySalesById(String salorderId) {
        //System.out.println(salorderId);
        //System.out.println(ss.querySalesById(salorderId));
        return ss.querySalesById(salorderId);
    }

    @RequestMapping("/querySalesByrowId")
    @ResponseBody
    public Sales querySalesByrowId(String rowId) {
        //System.out.println("查询的rowid"+rowId);
        //System.out.println("查询的内容"+ss.querySalesById(rowId));
        return ss.querySalesByrowId(rowId);
    }

    @RequestMapping("/addSales")
    @ResponseBody
    public String addSales(Sales sales) {
        String uuId = UUID.randomUUID().toString().replaceAll("-", "");
        sales.setRowId(uuId);
        ss.insertSales(sales);
        //System.out.println("sales是"+sales);
        return sales.toString();
    }

    @RequestMapping("/delSales")
    public String delSales() {
        ss.delSales("1");
        return "删除成功";
    }

    @RequestMapping("/updateSales")
    public Sales updateSales(Sales sales) {
        ss.updateSalesById(sales);
        //System.out.println("更新了的sales是"+sales);
        return sales;
    }

    @RequestMapping("/deleteSalesById")
    @ResponseBody
    public Sales deleteSalesById(Sales sales) {
        ss.deleteSalesById(sales);
        System.out.println("删除了的sales是" + sales);
        return sales;
    }

    @RequestMapping("/pageSales")
    @ResponseBody
    public List<Sales> pageSales(int pageIndex, int pageSize) {
        System.out.println("pageIndex" + pageIndex + "pageSize" + pageSize);
        return ss.pageSales(pageIndex-1, pageSize);
    }
}
