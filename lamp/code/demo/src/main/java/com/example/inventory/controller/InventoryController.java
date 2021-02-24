package com.example.inventory.controller;


import com.example.inventory.entity.Inventory;
import com.example.inventory.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InventoryController {


    @Autowired
    private InventoryService us;


    @GetMapping("/findOneInv")
    @CrossOrigin
    public List<Inventory> findInventory(String prolistId) {

        return us.findByName(prolistId);

    }

    @GetMapping("/findAllInv")
    @ResponseBody
    @CrossOrigin
    public List<Inventory> findAllInventory() {

        return us.findAllInv();

    }
    @GetMapping("/findOpeProlistId")
    @CrossOrigin
    public List<Inventory> updateInventory(String prolistId) {

        return us.openupdatePro(prolistId);

    }
    @GetMapping("/UpdatePro")
    @CrossOrigin
    public void UpdatePro(Inventory inventory)
    {

        us.UpdatePro(inventory);

    }
    @GetMapping("/DeletePro")
    @CrossOrigin
    public void DeletePayment(Inventory inventory)
    {

        us.deletePro(inventory);

    }
    @GetMapping ("/addPro")
    @CrossOrigin
    @ResponseBody
    public void Rec(Inventory inventory) {

//        receipt.setCollectionListId(UUID.randomUUID().toString());
        inventory.setDeletState("1");
        us.SavePro(inventory);
    }
}
