package com.example.stock.dao;


import com.example.stock.entity.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PurchaseDao extends JpaRepository<Purchase,Integer> {

    @Query(value = "select *from PSD_ORDER_PURCHASE where OPERATOR_ID=:OperatorID and APPROVAL_STATE=1 ",nativeQuery = true)
    List<Purchase> findByOperatorID(@Param("OperatorID") String OperatorID);
    @Query(value = "select *from PSD_ORDER_PURCHASE where DELET_STATE!=0 and APPROVAL_STATE=1",nativeQuery = true)
    List<Purchase> findAllByOperatorID();

    @Query(value = "select *from PSD_ORDER_PURCHASE where OPERATOR_ID=:OperatorID and APPROVAL_STATE=0 ",nativeQuery = true)
    List<Purchase> findSaleByOperatorID(@Param("OperatorID") String OperatorID);
    @Query(value = "select *from PSD_ORDER_PURCHASE where DELET_STATE!=0 and APPROVAL_STATE=0",nativeQuery = true)
    List<Purchase> findAllSaleByOperatorID();


    @Modifying
    @Query(value = "update  PSD_ORDER_PURCHASE set DELET_STATE=0 where ORDER_ID=:OrderId ",nativeQuery = true)
    void delByRowId(@Param("OrderId") String OrderId);

    @Query(value = "select *from PSD_ORDER_PURCHASE where ORDER_ID=:OrderId ",nativeQuery = true)
    List<Purchase> findByOrderId(@Param("OrderId") String OrderId);
    @Modifying
    @Query(value = "update  PSD_ORDER_PURCHASE set OPERATOR_ID=:#{#purchase.OperatorID},CUS_ID=:#{#purchase.CusId},LIST_REMARKS=:#{#purchase.ListRemarks},ORDER_TOTAL=:#{#purchase.OrderTotal},ORDER_STATE=:#{#purchase.OrderState},CREAT_DATE=:#{#purchase.CreatDate},CRTAT_USER=:#{#purchase.CreatUser} where ORDER_ID=:#{#purchase.OrderId} ",nativeQuery = true)
    void updateByOrderId(@Param("purchase") Purchase purchase);



}
