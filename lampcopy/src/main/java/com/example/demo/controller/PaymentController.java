package com.example.demo.controller;


import com.example.demo.entity.Payment;
import com.example.demo.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PaymentController {

    @Autowired
    PaymentService ps;

//    @CrossOrigin不写的话前端的success(data)就接收不到值。
    @GetMapping("findAllPay")
    @CrossOrigin
    public List<Payment> findAll(){
        return ps.findAllPayment();
    }

//    String payId是前端传过来的参数
    @CrossOrigin
    @GetMapping("/findOnePay")
    public List<Payment> findOne(String paymentId){
        return ps.findOnePay(paymentId);
    }


    @CrossOrigin
    @GetMapping("/addPay")
    public void addOne(Payment p){
        ps.addPayment(p);
    }


    @CrossOrigin
    @GetMapping("/findOpePaymentId")
    public List<Payment> showUpdate(String paymentId){
        return ps.findOnePay(paymentId);
    }


    @CrossOrigin
    @GetMapping("/UpdatePay")
    public void updatePay(Payment p){
        ps.updatePay(p);
    }


    @CrossOrigin
    @GetMapping("/DeletePay")
    public void DeletePay(Payment p){

        ps.DeletePay(p);

    }
}
