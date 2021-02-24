package com.example.inventory.dao;


import com.example.inventory.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InventoryDao  extends JpaRepository<Inventory,Integer> {
    //    查询单个数据
    @Query(value = "select PROLIST_ID,STOCK_CHECK,STOCK_CREATDATE,STOCK_CRTATOR,STOCK_MODIFYDATE," +
            "STOCK_REVISER,DELET_STATE,APPROVAL_STATE" +
            " from psd_stock_info where PROLIST_ID=:prolistId",nativeQuery = true)
    List<Inventory> findInventoryByName(@Param("prolistId") String prolistId);

    //    查询多个数据
    @Query(value = "select PROLIST_ID,STOCK_CHECK,STOCK_CREATDATE,STOCK_CRTATOR,STOCK_MODIFYDATE," +
            "STOCK_REVISER,DELET_STATE,APPROVAL_STATE" +
            " from psd_stock_info where DELET_STATE!=0",nativeQuery = true)
    List<Inventory> findAllByInventoryID();

    //    打开修改单个数据
    @Modifying
    @Query(value = "select PROLIST_ID,STOCK_CHECK,STOCK_CREATDATE,STOCK_CRTATOR,STOCK_MODIFYDATE," +
            "STOCK_REVISER,DELET_STATE,APPROVAL_STATE" +
            " from psd_stock_info  where PROLIST_ID=:prolistId ",nativeQuery = true)
    List<Inventory> openupdateproById(@Param("prolistId") String prolistId);

    //    修改数据
    @Modifying
    @Query(value = "update psd_stock_info set PROLIST_ID=:#{#inventory.prolistId},STOCK_CHECK=:#{#inventory.stockCheck},STOCK_CREATDATE=:#{#inventory.stockCreatDate},STOCK_CRTATOR=:#{#inventory.stockModifyDate},STOCK_REVISER=:#{#inventory.stockReviser},DELET_STATE=:#{#inventory.deletState} where PROLIST_ID=:#{#inventory.prolistId} ",nativeQuery = true)
    void updateByProId(@Param("inventory") Inventory inventory);

    //        删除数据
    @Modifying
    @Query(value = "update psd_stock_info set DELET_STATE=:#{#inventory.deletState}  where PROLIST_ID=:#{#inventory.prolistId}  ",nativeQuery = true)
    void deleteByProId(@Param("inventory") Inventory inventory);


}
