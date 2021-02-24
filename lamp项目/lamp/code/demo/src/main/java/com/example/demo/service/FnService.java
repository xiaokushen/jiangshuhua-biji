package com.example.demo.service;

import com.example.demo.dao.FnDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FnService {
    @Autowired
    FnDao dao;

  /*  public List<FnList> queryFn(String funId){
        return dao.queryFnListByFunId();
    }*/
}
