package com.example.inventory.service;

import com.example.inventory.dao.ReceiptDao;
import com.example.inventory.entity.Receipt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ReceiptService {
    @Autowired
    ReceiptDao dao;

    public List<Receipt> findByName(String ListId)
    {
        return dao.findReceiptByName(ListId);

    }
    public List<Receipt> findAllRec()
    {
        return dao.findAllByOperatorID();

    }
    @Transactional
    public List<Receipt> openupdateRec(String collectionListId)
    {
        return dao.openupdateByOrderId(collectionListId);

    }
    @Transactional
    public void UpdateOpe(Receipt receipt)
    {

        dao.updateByColListId(receipt);

    }
    @Transactional
    public void deleteRec(Receipt receipt)
    {

        dao.deleteByColListId(receipt);

    }
    @Transactional
    public void SaveRec (Receipt receipt)
    {
        dao.save(receipt);

    }
}
