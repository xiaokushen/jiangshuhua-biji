package com.example.demo.service;

import com.example.demo.dao.PaymentDao;
import com.example.demo.entity.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PaymentService {

    @Autowired
    PaymentDao dao;

    public List<Payment> findAllPayment(){
        return dao.findAll();
    }


    public List<Payment> findOnePay(String paymentId){
        return dao.findFirstByPaymentId(paymentId);
    }

    @Transactional
    public void addPayment(Payment p){
        dao.save(p);
    }

    @Transactional
    public void updatePay(Payment p){
       dao.updateByPayId(p);
    }

    @Transactional
    public void DeletePay(Payment p){
        dao.DeletePay(p);
    }

}
