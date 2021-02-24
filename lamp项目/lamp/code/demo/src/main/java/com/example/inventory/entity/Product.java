package com.example.inventory.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "psd_product_list") //数据库中的表名
public class Product implements Serializable {
    @Id
    @Column(name = "ROW_ID")//名称
    private Integer rowId;

    @Column(name = "PROLIST_ID")//名称
    private String prolistID;

    @Column(name = "PRODUCT_NAME")//名称
    private String productName;

    @Column(name = "PRODUCT_MODEL")//型号
    private String productModel;

    @Column(name = "STOCK_NUMBER")//库存数量
    private Integer stockNumber;

    @Column(name = "STOCK_AVEPRICE")//库存均价
    private String stockAvePrice;

    @Column(name = "STOCK_BATCH")//批次
    private String stockBatch;

    @Column(name = "STOCK_BATCHNUMB")//批号
    private String stockBatchNumb;

    @Column(name = "PRODUCT_DATE")//出厂日期
    private String productDate;

    public Product() {
    }

    public Product(Integer rowId, String prolistID, String productName, String productModel, Integer stockNumber, String stockAvePrice, String stockBatch, String stockBatchNumb, String productDate) {
        this.rowId = rowId;
        this.prolistID = prolistID;
        this.productName = productName;
        this.productModel = productModel;
        this.stockNumber = stockNumber;
        this.stockAvePrice = stockAvePrice;
        this.stockBatch = stockBatch;
        this.stockBatchNumb = stockBatchNumb;
        this.productDate = productDate;
    }
}
