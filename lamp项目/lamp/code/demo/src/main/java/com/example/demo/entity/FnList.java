package com.example.demo.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "psd_function_list")
public class FnList {
    @Id
    @Column(name = "FUN_ID")
    private String funId;

    @Column(name = "FUN_NAME")
    private String funName;

    @Column(name = "FUN_URL")
    private String funUrl;

    @Column(name = "PARENT_ID")
    private String parentId;

    @Column(name = "FUN_LEVEL")
    private String funLv;

    public FnList() {
    }

    public FnList(String funId, String funName, String funUrl, String parentId, String funLv) {
        this.funId = funId;
        this.funName = funName;
        this.funUrl = funUrl;
        this.parentId = parentId;
        this.funLv = funLv;
    }

    @Override
    public String toString() {
        return "FnList{" +
                "funId='" + funId + '\'' +
                ", funName='" + funName + '\'' +
                ", funUrl='" + funUrl + '\'' +
                ", parentId='" + parentId + '\'' +
                ", funLv='" + funLv + '\'' +
                '}';
    }
}
