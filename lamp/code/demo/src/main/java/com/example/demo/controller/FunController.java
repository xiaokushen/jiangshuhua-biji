package com.example.demo.controller;

import com.example.demo.service.FnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunController {
    @Autowired
    FnService fnService;
   /* @RequestMapping("/queryFun")
    public List<FnList> queryById(String funId){
        return fnService.queryFn(funId);
    }*/
}
