package com.example.inventory.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "jcxxt_collection_goods") //数据库中的表名
public class Receipt implements Serializable {
    @Id
    @Column(name = "COLLECTION_LISTID")//数据库实际列名STUDENT_ID如果报红色就点击右下角选中间
    //@GeneratedValue(strategy = GenerationType.IDENTITY)//自动生成主键
    private String collectionListId;

    @Column(name = "TRANSFER_ID")//数据库实际列名
    private String transferId;

    @Column(name = "COLLECTION_TOTAL")//数据库实际列名
    private Integer collectionTotal;

    @Column(name = "COLLECTION_CREATDATE")//数据库实际列名
    private String collectionCreatDate;

    @Column(name = "COLLECTION_CRTATOR")//数据库实际列名
    private String collectionCrtator;

    @Column(name = "COLLECTION_MODIFYDATE")//数据库实际列名
    private String collectionModifyDate;

    @Column(name = "COLLECTION_REVISER")//数据库实际列名
    private String collectionReviser;

    @Column(name = "COLLECTION_DELET")//数据库实际列名
    private String collectionDelet;

    public Receipt(String collectionListId, String transferId, Integer collectionTotal, String collectionCreatDate, String collectionCrtator, String collectionModifyDate, String collectionReviser, String collectionDelet) {
        this.collectionListId = collectionListId;
        this.transferId = transferId;
        this.collectionTotal = collectionTotal;
        this.collectionCreatDate = collectionCreatDate;
        this.collectionCrtator = collectionCrtator;
        this.collectionModifyDate = collectionModifyDate;
        this.collectionReviser = collectionReviser;
        this.collectionDelet = collectionDelet;
    }

    public Receipt() {
    }

    public String getCollectionListId() {
        return collectionListId;
    }

    public void setCollectionListId(String collectionListId) {
        this.collectionListId = collectionListId;
    }

    public String getTransferId() {
        return transferId;
    }

    public void setTransferId(String transferId) {
        this.transferId = transferId;
    }

    public Integer getCollectionTotal() {
        return collectionTotal;
    }

    public void setCollectionTotal(Integer collectionTotal) {
        this.collectionTotal = collectionTotal;
    }

    public String getCollectionCreatDate() {
        return collectionCreatDate;
    }

    public void setCollectionCreatDate(String collectionCreatDate) {
        this.collectionCreatDate = collectionCreatDate;
    }

    public String getCollectionCrtator() {
        return collectionCrtator;
    }

    public void setCollectionCrtator(String collectionCrtator) {
        this.collectionCrtator = collectionCrtator;
    }

    public String getCollectionModifyDate() {
        return collectionModifyDate;
    }

    public void setCollectionModifyDate(String collectionModifyDate) {
        this.collectionModifyDate = collectionModifyDate;
    }

    public String getCollectionReviser() {
        return collectionReviser;
    }

    public void setCollectionReviser(String collectionReviser) {
        this.collectionReviser = collectionReviser;
    }

    public String getCollectionDelet() {
        return collectionDelet;
    }

    public void setCollectionDelet(String collectionDelet) {
        this.collectionDelet = collectionDelet;
    }


}
