package com.example.inventory.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "jcxxt_payment_goods") //数据库中的表名
public class Payment implements Serializable {
    @Id
    @Column(name = "PAYMENT_ID")//数据库实际列名STUDENT_ID如果报红色就点击右下角选中间
    private String paymentId;

    @Column(name = "SHIPGOODS_ID")//数据库实际列名
    private String shipGoodsId;

    @Column(name = "ACCOUNT_ID")//数据库实际列名
    private Integer accountId;

    @Column(name = "DETAILEDLIST_ID")//数据库实际列名
    private String detailedListId;

    @Column(name = "PAYMENT_TOTSL")//数据库实际列名
    private String paymentTotsl;

    @Column(name = "PAYMENT_CREATDATE")//数据库实际列名
    private String paymentCreatDate;

    @Column(name = "PAYMENT_CRTATOR")//数据库实际列名
    private String paymentCrtator;

    @Column(name = "PAYMENT_MODIFYDATE")//数据库实际列名
    private String paymentModifyDate;

    @Column(name = "PAYMENT_REVISER")//数据库实际列名
    private String paymentReviser;

    @Column(name = "PAYMENT_DELET")//数据库实际列名
    private String paymentDelet;

    public Payment() {
    }

    public Payment(String paymentId, String shipGoodsId, Integer accountId, String detailedListId, String paymentTotsl, String paymentCreatDate, String paymentCrtator, String paymentModifyDate, String paymentReviser, String paymentDelet) {
        this.paymentId = paymentId;
        this.shipGoodsId = shipGoodsId;
        this.accountId = accountId;
        this.detailedListId = detailedListId;
        this.paymentTotsl = paymentTotsl;
        this.paymentCreatDate = paymentCreatDate;
        this.paymentCrtator = paymentCrtator;
        this.paymentModifyDate = paymentModifyDate;
        this.paymentReviser = paymentReviser;
        this.paymentDelet = paymentDelet;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getShipGoodsId() {
        return shipGoodsId;
    }

    public void setShipGoodsId(String shipGoodsId) {
        this.shipGoodsId = shipGoodsId;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getDetailedListId() {
        return detailedListId;
    }

    public void setDetailedListId(String detailedListId) {
        this.detailedListId = detailedListId;
    }

    public String getPaymentTotsl() {
        return paymentTotsl;
    }

    public void setPaymentTotsl(String paymentTotsl) {
        this.paymentTotsl = paymentTotsl;
    }

    public String getPaymentCreatDate() {
        return paymentCreatDate;
    }

    public void setPaymentCreatDate(String paymentCreatDate) {
        this.paymentCreatDate = paymentCreatDate;
    }

    public String getPaymentCrtator() {
        return paymentCrtator;
    }

    public void setPaymentCrtator(String paymentCrtator) {
        this.paymentCrtator = paymentCrtator;
    }

    public String getPaymentModifyDate() {
        return paymentModifyDate;
    }

    public void setPaymentModifyDate(String paymentModifyDate) {
        this.paymentModifyDate = paymentModifyDate;
    }

    public String getPaymentReviser() {
        return paymentReviser;
    }

    public void setPaymentReviser(String paymentReviser) {
        this.paymentReviser = paymentReviser;
    }

    public String getPaymentDelet() {
        return paymentDelet;
    }

    public void setPaymentDelet(String paymentDelet) {
        this.paymentDelet = paymentDelet;
    }
}
