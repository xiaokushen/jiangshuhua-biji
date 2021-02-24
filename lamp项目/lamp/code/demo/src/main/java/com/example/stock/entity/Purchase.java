package com.example.stock.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "PSD_ORDER_PURCHASE")
public class Purchase {
   @Id
    @Column(name="ROW_ID")
    private String RowId;
    @Column(name="ORDER_ID")
    private String OrderId;
    @Column(name="CUS_ID")
    private String CusId;
    @Column(name="WAREHOUSE_ID")
    private String WarehouseID;
    @Column(name="OPERATOR_ID")
    private String OperatorID;
    @Column(name="PRODUCT_ID")
    private String ProuductID;
    @Column(name="LIST_REMARKS")
    private String ListRemarks;
    @Column(name="ORDER_TOTAL")
    private int OrderTotal;
    @Column(name="ORDER_STATE")
    private String OrderState;
    @Column(name="CREAT_DATE")
    private String  CreatDate;
    @Column(name="CRTAT_USER")
    private String   CreatUser;
    @Column(name="MODIFY_DATE")
    private String  ModifyDate;
    @Column(name="REVISE_USER")
    private String ReviseUser;
    @Column(name="DELET_STATE")
    private String DeletState;
    @Column(name="APPROVAL_STATE")
    private String  AppRovalState;

    public Purchase(String rowId, String orderId, String cusId, String warehouseID, String operatorID, String prouductID, String listRemarks, int orderTotal, String orderState, String creatDate, String creatUser, String modifyDate, String reviseUser, String deletState, String appRovalState) {
        RowId = rowId;
        OrderId = orderId;
        CusId = cusId;
        WarehouseID = warehouseID;
        OperatorID = operatorID;
        ProuductID = prouductID;
        ListRemarks = listRemarks;
        OrderTotal = orderTotal;
        OrderState = orderState;
        CreatDate = creatDate;
        CreatUser = creatUser;
        ModifyDate = modifyDate;
        ReviseUser = reviseUser;
        DeletState = deletState;
        AppRovalState = appRovalState;
    }

    public Purchase(String orderId,String operatorID, String cusId, String warehouseID,   String listRemarks, int orderTotal, String orderState, String creatDate, String creatUser,  String deletState) {
        OrderId = orderId;
        OperatorID = operatorID;
        CusId = cusId;
        WarehouseID = warehouseID;
        ListRemarks = listRemarks;
        OrderTotal = orderTotal;
        OrderState = orderState;
        CreatDate = creatDate;
        CreatUser = creatUser;
        DeletState = deletState;
    }

    public Purchase()
    {



    }

    public String getRowId() {
        return RowId;
    }

    public void setRowId(String rowId) {
        RowId = rowId;
    }

    public String getOrderState() {
        return OrderState;
    }

    public void setOrderState(String orderState) {
        OrderState = orderState;
    }


    public String getOrderId() {
        return OrderId;
    }

    public void setOrderId(String orderId) {
        OrderId = orderId;
    }

    public String getCusId() {
        return CusId;
    }

    public void setCusId(String cusId) {
        CusId = cusId;
    }

    public String getWarehouseID() {
        return WarehouseID;
    }

    public void setWarehouseID(String warehouseID) {
        WarehouseID = warehouseID;
    }

    public String getOperatorID() {
        return OperatorID;
    }

    public void setOperatorID(String operatorID) {
        OperatorID = operatorID;
    }

    public String getProuductID() {
        return ProuductID;
    }

    public void setProuductID(String prouductID) {
        ProuductID = prouductID;
    }

    public String getListRemarks() {
        return ListRemarks;
    }

    public void setListRemarks(String listRemarks) {
        ListRemarks = listRemarks;
    }

    public int getOrderTotal() {
        return OrderTotal;
    }

    public void setOrderTotal(int orderTotal) {
        OrderTotal = orderTotal;
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

    public String getModifyDate() {
        return ModifyDate;
    }

    public void setModifyDate(String modifyDate) {
        ModifyDate = modifyDate;
    }

    public String getReviseUser() {
        return ReviseUser;
    }

    public void setReviseUser(String reviseUser) {
        ReviseUser = reviseUser;
    }

    public String getDeletState() {
        return DeletState;
    }

    public void setDeletState(String deletState) {
        DeletState = deletState;
    }

    public String getAppRovalState() {
        return AppRovalState;
    }

    public void setAppRovalState(String appRovalState) {
        AppRovalState = appRovalState;
    }
}
