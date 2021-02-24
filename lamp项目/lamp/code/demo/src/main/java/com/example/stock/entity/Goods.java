package com.example.stock.entity;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "psd_warehouse_goods")


public class Goods {
    @Id
    @Column(name="WAREGOODS_ID")
    private String WaregoodsId;
    @Column(name="PRODUCT_ID")
    private String ProductId;
    @Column(name="PRODUCT_NAME")
    private String  ProductName;
    @Column(name="PRODUCT_MODEL")
    private String  ProductModel;
    @Column(name="PRODUCT_NUMBE")
    private int ProductNumbe;
    @Column(name="PRODUCT_PRICE")
    private int  ProductPrice;
    @Column(name="TOTAL_MONEY")
    private int  TotalMoney;
    @Column(name="WAREGOODS_REMARKS")
    private String WaregoodsRemarks;
    @Column(name="CREAT_DATE")
    private String CreatDate;
    @Column(name="CRTAT_USER")
    private String CreatUser;
    @Column(name="DELET_STATE")
    private String DeletState;

    public Goods(String waregoodsId, String productId, String productName, String productModel, int productNumbe, int productPrice, int totalMoney, String waregoodsRemarks, String creatDate, String creatUser) {
        WaregoodsId = waregoodsId;
        ProductId = productId;
        ProductName = productName;
        ProductModel = productModel;
        ProductNumbe = productNumbe;
        ProductPrice = productPrice;
        TotalMoney = totalMoney;
        WaregoodsRemarks = waregoodsRemarks;
        CreatDate = creatDate;
        CreatUser = creatUser;
    }

    public Goods()
    {




    }

    public String getWaregoodsId() {
        return WaregoodsId;
    }

    public void setWaregoodsId(String waregoodsId) {
        WaregoodsId = waregoodsId;
    }

    public String getProductId() {
        return ProductId;
    }

    public void setProductId(String productId) {
        ProductId = productId;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public String getProductModel() {
        return ProductModel;
    }

    public void setProductModel(String productModel) {
        ProductModel = productModel;
    }

    public int getProductNumbe() {
        return ProductNumbe;
    }

    public void setProductNumbe(int productNumbe) {
        ProductNumbe = productNumbe;
    }

    public int getProductPrice() {
        return ProductPrice;
    }

    public void setProductPrice(int productPrice) {
        ProductPrice = productPrice;
    }

    public int getTotalMoney() {
        return TotalMoney;
    }

    public void setTotalMoney(int totalMoney) {
        TotalMoney = totalMoney;
    }

    public String getWaregoodsRemarks() {
        return WaregoodsRemarks;
    }

    public void setWaregoodsRemarks(String waregoodsRemarks) {
        WaregoodsRemarks = waregoodsRemarks;
    }

    public String getCreatDate() {
        return CreatDate;
    }

    public void setCreatDate(String creatDate) {
        CreatDate = creatDate;
    }

    public String getCreatUser() {
        return CreatUser;
    }

    public void setCreatUser(String creatUser) {
        CreatUser = creatUser;
    }

    public String getDeletState() {
        return DeletState;
    }

    public void setDeletState(String deletState) {
        DeletState = deletState;
    }

    public Goods(String deletState) {
        DeletState = deletState;
    }
}
