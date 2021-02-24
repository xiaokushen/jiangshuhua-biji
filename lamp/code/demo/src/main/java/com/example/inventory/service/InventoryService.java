package com.example.inventory.service;


import com.example.inventory.dao.InventoryDao;
import com.example.inventory.entity.Inventory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class InventoryService {
    @Autowired
    InventoryDao dao;

    public List<Inventory> findByName(String prolistId)
    {
        return dao.findInventoryByName(prolistId);

    }
    public List<Inventory> findAllInv()
    {
        return dao.findAllByInventoryID();

    }
    @Transactional
    public List<Inventory> openupdatePro(String prolistId)
    {
        return dao.openupdateproById(prolistId);

    }
    @Transactional
    public void UpdatePro(Inventory inventory)
    {

        dao.updateByProId(inventory);

    }
    @Transactional
    public void deletePro(Inventory inventory)
    {

        dao.deleteByProId(inventory);

    }
    @Transactional
    public void SavePro (Inventory inventory)
    {
        dao.save(inventory);

    }
}