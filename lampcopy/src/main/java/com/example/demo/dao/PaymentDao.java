package com.example.demo.dao;

import com.example.demo.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PaymentDao extends JpaRepository<Payment, String> {

    //    查询单个的
    List<Payment> findFirstByPaymentId(String paymentId);

//    @Param把payment对象捆绑到数据库进行匹配,nativeQuery = true表示使用原生sql
//    SHIPGOODS_ID=:#{#payment.shipGoodsId}   :#{#}的意思就是把值注入到SHIPGOODS_ID中
//    where SHIPGOODS_ID = :payment.shipGoodsId   :就是匹配值是否相等
    //    修改数据
    @Modifying
    @Query(value = "update jcxxt_payment_goods set SHIPGOODS_ID=:#{#payment.shipGoodsId},ACCOUNT_ID=:#{#payment.accountId},DETAILEDLIST_ID=:#{#payment.detailedListId},PAYMENT_TOTSL=:#{#payment.paymentTotsl},PAYMENT_CREATDATE=:#{#payment.paymentCreatDate},PAYMENT_CRTATOR=:#{#payment.paymentCrtator},PAYMENT_MODIFYDATE=:#{#payment.paymentModifyDate},PAYMENT_REVISER=:#{#payment.paymentReviser},PAYMENT_DELET=:#{#payment.paymentDelet} where payment_Id=:#{#payment.paymentId} ",nativeQuery = true)
    void updateByPayId(@Param("payment") Payment payment);

    @Modifying
    @Query(value = "update jcxxt_payment_goods set PAYMENT_DELET=:#{#payment.paymentDelet} where payment_Id=:#{#payment.paymentId} ",nativeQuery = true)
    void DeletePay(@Param("payment") Payment payment);

}
