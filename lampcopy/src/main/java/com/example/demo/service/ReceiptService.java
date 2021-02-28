package com.example.demo.service;

import com.example.demo.dao.ReceiptDao;
import com.example.demo.entity.Receipt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ReceiptService {

    @Autowired
    ReceiptDao dao;

    public List<Receipt> findAllRec(){
        return dao.findAllReceipt();
    }

    public List<Receipt> findOne(String collectionListId){
        return dao.findOne(collectionListId);
    }

    @Transactional
    public void addRec(Receipt r){
        dao.save(r);
    }

    @Transactional
    public void deleteOne(Receipt r){
        dao.deleteOne(r);
    }

    public List<Receipt> findOpenOne(String collectionListId){
        return dao.findFirstBycollectionListId(collectionListId);
    }

    @Transactional
    public void UpdateRec(Receipt r){
        dao.UpdateRec(r);
    }
}
