package com.example.inventory.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "psd_stock_info") //数据库中的表名
public class Inventory implements Serializable {
    @Id
    @Column(name = "PROLIST_ID")//数据库实际列名STUDENT_ID如果报红色就点击右下角选中间
    private String prolistId;

    @Column(name = "STOCK_CHECK")//数据库实际列名
    private String stockCheck;

    @Column(name = "STOCK_CREATDATE")//数据库实际列名
    private String stockCreatDate;

    @Column(name = "STOCK_CRTATOR")//数据库实际列名
    private String stockCrtator;

    @Column(name = "STOCK_MODIFYDATE")//数据库实际列名
    private String stockModifyDate;

    @Column(name = "STOCK_REVISER")//数据库实际列名
    private String stockReviser;

    @Column(name = "DELET_STATE")//数据库实际列名
    private String deletState;

    @Column(name = "APPROVAL_STATE")//数据库实际列名
    private String approvalState;

    public Inventory() {
    }

    public Inventory(String prolistId, String stockCheck, String stockCreatDate, String stockCrtator, String stockModifyDate, String stockReviser, String deletState, String approvalState) {
        this.prolistId = prolistId;
        this.stockCheck = stockCheck;
        this.stockCreatDate = stockCreatDate;
        this.stockCrtator = stockCrtator;
        this.stockModifyDate = stockModifyDate;
        this.stockReviser = stockReviser;
        this.deletState = deletState;
        this.approvalState = approvalState;
    }

    public String getProlistId() {
        return prolistId;
    }

    public void setProlistId(String prolistId) {
        this.prolistId = prolistId;
    }

    public String getStockCheck() {
        return stockCheck;
    }

    public void setStockCheck(String stockCheck) {
        this.stockCheck = stockCheck;
    }

    public String getStockCreatDate() {
        return stockCreatDate;
    }

    public void setStockCreatDate(String stockCreatDate) {
        this.stockCreatDate = stockCreatDate;
    }

    public String getStockCrtator() {
        return stockCrtator;
    }

    public void setStockCrtator(String stockCrtator) {
        this.stockCrtator = stockCrtator;
    }

    public String getStockModifyDate() {
        return stockModifyDate;
    }

    public void setStockModifyDate(String stockModifyDate) {
        this.stockModifyDate = stockModifyDate;
    }

    public String getStockReviser() {
        return stockReviser;
    }

    public void setStockReviser(String stockReviser) {
        this.stockReviser = stockReviser;
    }

    public String getDeletState() {
        return deletState;
    }

    public void setDeletState(String deletState) {
        this.deletState = deletState;
    }

    public String getApprovalState() {
        return approvalState;
    }

    public void setApprovalState(String approvalState) {
        this.approvalState = approvalState;
    }
}
