package com.example.demo.controller;


import com.example.demo.entity.Receipt;
import com.example.demo.service.ReceiptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReceiptController {
    @Autowired
    ReceiptService rs;

//查询全部的
    @CrossOrigin
    @GetMapping("/findAllRec")
    public List<Receipt> findAll(){
        return rs.findAllRec();
    }

    //模糊查询
    @CrossOrigin
    @GetMapping("/findOneRec")
    public List<Receipt> findOne(String collectionListId){
        return rs.findOne(collectionListId);
    }

//新增
    @CrossOrigin
    @GetMapping("/addRec")
    public void addOne(Receipt r){
        rs.addRec(r);
    }

//删除
    @CrossOrigin
    @GetMapping("/DeleteRec")
    public void deleteOne(Receipt r){
        rs.deleteOne(r);
    }

//打开修改页面
    @CrossOrigin
    @GetMapping("/openId")
    public List<Receipt> openId(String collectionListId){
        return rs.findOpenOne(collectionListId);
    }


    @CrossOrigin
    @GetMapping("/UpdateRec")
    public void UpdateRec(Receipt r){
        rs.UpdateRec(r);
    }
}
