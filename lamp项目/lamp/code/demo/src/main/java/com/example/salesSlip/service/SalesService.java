package com.example.salesSlip.service;

import com.example.salesSlip.dao.SalesDao;
import com.example.salesSlip.entity.Sales;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class SalesService {
    @Autowired
    SalesDao sd;
//查全部
    public List<Sales> querySalesById(String salorderId){
        return sd.querySalesById(salorderId);
    }
    //根据rowid查一个
    public Sales querySalesByrowId(String rowId){
        return sd.querySalesByrowId(rowId);
    }
//新增
    @Transactional
    public Sales insertSales(Sales sales){
        sd.save(sales);
        return sd.save(sales);
    }
    //物理删除 未做
    @Transactional
    public void delSales(String salorderId){
        sd.deleteById(salorderId);
    }
    //逻辑删除
    @Transactional
    public void deleteSalesById(Sales sales){
        sd.deleteSalesById(sales);
    }
    //修改
    @Transactional
    public void updateSalesById(Sales sales){
        System.out.println("service的sales是"+sales);
        sd.updateSalesById(sales);
    }
    //分页
    public List<Sales> pageSales(int pageIndex,int pageSize){
        Sort sort= Sort.by(Sort.Direction.ASC,"shiplistId");
        Pageable pb= PageRequest.of(pageIndex,pageSize,sort);
        Page<Sales> pc=sd.findAll(pb);
        //System.out.println(pc.toList());
        return pc.toList();
    }

}
