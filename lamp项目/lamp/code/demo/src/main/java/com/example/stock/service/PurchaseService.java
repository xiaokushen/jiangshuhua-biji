package com.example.stock.service;


import com.example.stock.dao.PurchaseDao;
import com.example.stock.entity.Purchase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class PurchaseService {

    @Autowired
    PurchaseDao Pd;

    public List<Purchase> findOpe(String  OperatorID) {


        return Pd.findByOperatorID(OperatorID);


    }

    public List<Purchase> findSaleAllOpe() {


        return Pd.findAllSaleByOperatorID();


    }

    public List<Purchase> findSaleOpe(String  OperatorID) {


        return Pd.findSaleByOperatorID(OperatorID);


    }

    public List<Purchase> findAllOpe() {


        return Pd.findAllByOperatorID();


    }


    public void SaveOpe (Purchase purchase)
    {
        Pd.save(purchase);



    }
    @Transactional
    public void DelOpe(String OrderId)
    {

        Pd.delByRowId(OrderId);


    }

    public List<Purchase> findOpeOrderId(String OrderId) {


        return Pd.findByOrderId(OrderId);


    }




    @Transactional
    public void UpdateOpe(Purchase purchase)
    {

      Pd.updateByOrderId(purchase);


    }


}
