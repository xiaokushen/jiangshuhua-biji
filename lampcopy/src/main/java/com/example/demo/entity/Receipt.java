package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
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
}