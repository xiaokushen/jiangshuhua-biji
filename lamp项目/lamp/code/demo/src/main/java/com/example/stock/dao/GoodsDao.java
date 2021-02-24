package com.example.stock.dao;


import com.example.stock.entity.Goods;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GoodsDao extends JpaRepository<Goods,Integer> {

    @Query(value = "select *from psd_warehouse_goods where PRODUCT_ID=:ProductId AND DELET_STATE!=0 ",nativeQuery = true)
    List<Goods> findByProductId(@Param("ProductId") String ProductId);

    @Query(value = "select *from psd_warehouse_goods AND DELET_STATE!=0  ",nativeQuery = true)
    List<Goods> findallByProductId();

    @Query(value = "select *from psd_warehouse_goods where PRODUCT_NAME=:ProductName AND DELET_STATE!=0  ",nativeQuery = true)
    List<Goods> findByProductName(@Param("ProductName") String ProductName);


    @Query(value = "select *from psd_warehouse_goods where WAREGOODS_ID=:WaregoodsId AND DELET_STATE!=0 ",nativeQuery = true)
    List<Goods> findByWaregoodsId(@Param("WaregoodsId") String WaregoodsId);


    @Modifying
    @Query(value = "update  psd_warehouse_goods  set DELET_STATE=0 where  WAREGOODS_ID=:WaregoodsId ",nativeQuery = true)
    void delByWaregoodsId(@Param("WaregoodsId") String WaregoodsId);



}
