package com.example.inventory.controller;

import com.example.inventory.entity.Receipt;
import com.example.inventory.service.ReceiptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReceiptController {


        @Autowired
        private ReceiptService us;


        @GetMapping("/findOneRec")
        @CrossOrigin
        public List<Receipt> findReceipt(String collectionListId) {

            return us.findByName(collectionListId);

    }
    @GetMapping("/findAllRec")
    @ResponseBody
    @CrossOrigin
    public List<Receipt> findAllReceipt() {

        return us.findAllRec();

    }
    @GetMapping("/findOpeReceiptId")
    @CrossOrigin
    public List<Receipt> updateReceipt(String collectionListId) {

        return us.openupdateRec(collectionListId);

    }
    @GetMapping("/UpdateRec")
    @CrossOrigin
    public void UpdateRec(Receipt receipt)
    {

        us.UpdateOpe(receipt);

    }
    @GetMapping("/DeleteRec")
    @CrossOrigin
    public void DeleteReceipt(Receipt receipt)
    {

        us.deleteRec(receipt);

    }
    @GetMapping ("/addRec")
    @CrossOrigin
    @ResponseBody
    public void Rec(Receipt receipt) {

//        receipt.setCollectionListId(UUID.randomUUID().toString());
        receipt.setCollectionDelet("1");
        us.SaveRec(receipt);
    }

}

