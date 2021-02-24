package com.example.inventory.controller;

import com.example.inventory.entity.Payment;
import com.example.inventory.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PaymentController {


    @Autowired
    private PaymentService us;


    @GetMapping("/findOnePay")
    @CrossOrigin
    public List<Payment> findPayment(String paymentId) {

        return us.findByName(paymentId);

    }

    @GetMapping("/findAllPay")
    @ResponseBody
    @CrossOrigin
    public List<Payment> findAllReceipt() {

        return us.findAllPay();

    }
    @GetMapping("/findOpePaymentId")
    @CrossOrigin
    public List<Payment> updateReceipt(String paymentId) {

        return us.openupdatePay(paymentId);

    }
    @GetMapping("/UpdatePay")
    @CrossOrigin
    public void UpdateRec(Payment paymentId)
    {

        us.UpdatePay(paymentId);

    }
    @GetMapping("/DeletePay")
    @CrossOrigin
    public void DeletePayment(Payment payment)
    {

        us.deletePay(payment);

    }
    @GetMapping ("/addPay")
    @CrossOrigin
    @ResponseBody
    public void Rec(Payment payment) {

//        receipt.setCollectionListId(UUID.randomUUID().toString());
        payment.setPaymentDelet("1");
        us.SavePay(payment);
    }
}
