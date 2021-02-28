package com.example.demo.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

//@Entity:类名对应表名，class字段名对应表的字段名
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "jcxxt_payment_goods")
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

}
