package com.example.stock.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "psd_product_sort")
public class Sort {
    @Id
    @Column(name="PRODUCT_ID")
    private String ProductId;
    @Column(name="PRODUCT_NAME")
    private  String ProductName;
    @Column(name="PRODUCT_FASORT")
    private String ProductFasort;
    @Column(name="PRODUCT_SONSORT")
    private String ProductSonsort;
    @Column(name="CREAT_DATE")
    private String CreatDate;
    @Column(name="CRTAT_USER")
    private String CreatUser;
    @Column(name="DELET_STATE")
    private String DeletState ;

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

    public String getProductFasort() {
        return ProductFasort;
    }

    public void setProductFasort(String productFasort) {
        ProductFasort = productFasort;
    }

    public String getProductSonsort() {
        return ProductSonsort;
    }

    public void setProductSonsort(String productSonsort) {
        ProductSonsort = productSonsort;
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

    public Sort(String productId, String productName, String productFasort, String productSonsort, String creatDate, String creatUser, String deletState) {
        ProductId = productId;
        ProductName = productName;
        ProductFasort = productFasort;
        ProductSonsort = productSonsort;
        CreatDate = creatDate;
        CreatUser = creatUser;
        DeletState = deletState;
    }



    public Sort()
    {



    }
}
