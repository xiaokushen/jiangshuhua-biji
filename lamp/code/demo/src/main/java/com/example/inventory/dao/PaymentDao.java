package com.example.inventory.dao;

import com.example.inventory.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaymentDao  extends JpaRepository<Payment,Integer> {
    //    查询单个数据
    @Query(value = "select PAYMENT_ID,SHIPGOODS_ID,ACCOUNT_ID,DETAILEDLIST_ID,PAYMENT_TOTSL," +
            "PAYMENT_CREATDATE,PAYMENT_CRTATOR,PAYMENT_MODIFYDATE,PAYMENT_REVISER,PAYMENT_DELET" +
            " from jcxxt_payment_goods where PAYMENT_ID=:paymentId",nativeQuery = true)
    List<Payment> findPaymentByName(@Param("paymentId") String paymentId);

    //    查询多个数据
    @Query(value = "select PAYMENT_ID,SHIPGOODS_ID,ACCOUNT_ID,DETAILEDLIST_ID,PAYMENT_TOTSL," +
            "PAYMENT_CREATDATE,PAYMENT_CRTATOR,PAYMENT_MODIFYDATE,PAYMENT_REVISER,PAYMENT_DELET" +
            " from jcxxt_payment_goods where PAYMENT_DELET!=0",nativeQuery = true)
    List<Payment> findAllByPaymentID();

    //    打开修改单个数据
    @Modifying
    @Query(value = "select PAYMENT_ID,SHIPGOODS_ID,ACCOUNT_ID,DETAILEDLIST_ID,PAYMENT_TOTSL," +
            "PAYMENT_CREATDATE,PAYMENT_CRTATOR,PAYMENT_MODIFYDATE,PAYMENT_REVISER,PAYMENT_DELET" +
            " from jcxxt_payment_goods  where PAYMENT_ID=:paymentId ",nativeQuery = true)
    List<Payment> openupdateByOrderId(@Param("paymentId") String paymentId);

    //    修改数据
    @Modifying
    @Query(value = "update jcxxt_payment_goods set PAYMENT_ID=:#{#payment.paymentId},SHIPGOODS_ID=:#{#payment.shipGoodsId},ACCOUNT_ID=:#{#payment.accountId},DETAILEDLIST_ID=:#{#payment.detailedListId},PAYMENT_TOTSL=:#{#payment.paymentTotsl},PAYMENT_CREATDATE=:#{#payment.paymentCreatDate},PAYMENT_CRTATOR=:#{#payment.paymentCrtator},PAYMENT_MODIFYDATE=:#{#payment.paymentModifyDate},PAYMENT_REVISER=:#{#payment.paymentReviser},PAYMENT_DELET=:#{#payment.paymentDelet} where payment_Id=:#{#payment.paymentId} ",nativeQuery = true)
    void updateByPayId(@Param("payment") Payment payment);

//        删除数据
    @Modifying
    @Query(value = "update jcxxt_payment_goods set PAYMENT_DELET=:#{#payment.paymentDelet}  where payment_Id=:#{#payment.paymentId}  ",nativeQuery = true)
    void deleteByPaytId(@Param("payment") Payment payment);


}
