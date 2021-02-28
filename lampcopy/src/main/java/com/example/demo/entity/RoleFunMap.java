package com.example.demo.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "psd_function_role")
public class RoleFunMap {

    @Id
    @Column(name = "ROW_ID")
    private String rowId;

    @Column(name = "FUN_ID")
    private String funId;

    @Column(name = "ROLE_ID")
    private String roleId;

    public RoleFunMap() {
    }

    public String getRowId() {
        return rowId;
    }

    public void setRowId(String rowId) {
        this.rowId = rowId;
    }

    public String getFunId() {
        return funId;
    }

    public void setFunId(String funId) {
        this.funId = funId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        return "RoleFunMap{" +
                "rowId='" + rowId + '\'' +
                ", funId='" + funId + '\'' +
                ", roleId='" + roleId + '\'' +
                '}';
    }
}
