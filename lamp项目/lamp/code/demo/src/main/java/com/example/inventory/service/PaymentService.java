package com.example.inventory.service;

import com.example.inventory.dao.PaymentDao;
import com.example.inventory.entity.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PaymentService {
    @Autowired
    PaymentDao dao;

    public List<Payment> findByName(String paymentId)
    {
        return dao.findPaymentByName(paymentId);

    }
    public List<Payment> findAllPay()
    {
        return dao.findAllByPaymentID();

    }
    @Transactional
    public List<Payment> openupdatePay(String paymentId)
    {
        return dao.openupdateByOrderId(paymentId);

    }
    @Transactional
    public void UpdatePay(Payment payment)
    {

        dao.updateByPayId(payment);

    }
    @Transactional
    public void deletePay(Payment payment)
    {

        dao.deleteByPaytId(payment);

    }
    @Transactional
    public void SavePay (Payment payment)
    {
        dao.save(payment);

    }
}