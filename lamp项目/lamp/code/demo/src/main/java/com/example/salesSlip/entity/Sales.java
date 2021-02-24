package com.example.salesSlip.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@JsonIgnoreProperties(value ={"hibernateLazyInitializer"})
@Data
@Entity
@Table(name = "PSD_SALES_SLIP")
public class Sales {
    @Id
    @Column(name = "ROW_ID")//数据库实际列名为ROW_ID
    private String rowId;
    @Column(name = "SALORDER_ID")
    private String salorderId;
    @Column(name = "CUS_ID")
    private String cusId;
    @Column(name = "SALES_NAME")
    private String salesname;
    @Column(name = "WAREHOUSE_ID")
    private String warehouseId;
    @Column(name = "SHIPLIST_ID")
    private Integer shiplistId;
    @Column(name = "SALES_BEFOMONEY")
    private Integer salesbefomoney;
    @Column(name = "SALES_DISCOUNT")
    private String salesdiscount;
    @Column(name = "SALES_COUPONMONEY")
    private Integer salescouponmoney;
    @Column(name = "SALES_REMARKS")
    private String salesremarks;
    @Column(name = "SALES_STATE")
    private String salesstate;
    @Column(name = "CREAT_DATE")
    private String creatdate;
    @Column(name = "CRTAT_USER")
    private String creatuser;
    @Column(name = "MODIFY_DATE")
    private String modifydate;
    @Column(name = "REVISE_USER")
    private String reviseuser;
    @Column(name = "DELET_STAT")
    private String deletstat="Y";
    @Column(name = "APPROVAL_STATE")
    private Integer approvalstate;


    public Sales() {
    }

    public Sales(String rowId, String salorderId, String cusId, String salesname, String warehouseId, Integer shiplistId, Integer salesbefomoney, String salesdiscount, Integer salescouponmoney, String salesremarks, String salesstate, String creatdate, String creatuser, String modifydate, String reviseuser, String deletstat, Integer approvalstate) {
        this.rowId = rowId;
        this.salorderId = salorderId;
        this.cusId = cusId;
        this.salesname = salesname;
        this.warehouseId = warehouseId;
        this.shiplistId = shiplistId;
        this.salesbefomoney = salesbefomoney;
        this.salesdiscount = salesdiscount;
        this.salescouponmoney = salescouponmoney;
        this.salesremarks = salesremarks;
        this.salesstate = salesstate;
        this.creatdate = creatdate;
        this.creatuser = creatuser;
        this.modifydate = modifydate;
        this.reviseuser = reviseuser;
        this.deletstat = deletstat;
        this.approvalstate = approvalstate;
    }

    public String getRowId() {
        return rowId;
    }

    public void setRowId(String rowId) {
        this.rowId = rowId;
    }

    public String getSalorderId() {
        return salorderId;
    }

    public void setSalorderId(String salorderId) {
        this.salorderId = salorderId;
    }

    public String getCusId() {
        return cusId;
    }

    public void setCusId(String cusId) {
        this.cusId = cusId;
    }

    public String getSalesname() {
        return salesname;
    }

    public void setSalesname(String salesname) {
        this.salesname = salesname;
    }

    public String getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(String warehouseId) {
        this.warehouseId = warehouseId;
    }

    public Integer getShiplistId() {
        return shiplistId;
    }

    public void setShiplistId(Integer shiplistId) {
        this.shiplistId = shiplistId;
    }

    public Integer getSalesbefomoney() {
        return salesbefomoney;
    }

    public void setSalesbefomoney(Integer salesbefomoney) {
        this.salesbefomoney = salesbefomoney;
    }

    public String getSalesdiscount() {
        return salesdiscount;
    }

    public void setSalesdiscount(String salesdiscount) {
        this.salesdiscount = salesdiscount;
    }

    public Integer getSalescouponmoney() {
        return salescouponmoney;
    }

    public void setSalescouponmoney(Integer salescouponmoney) {
        this.salescouponmoney = salescouponmoney;
    }

    public String getSalesremarks() {
        return salesremarks;
    }

    public void setSalesremarks(String salesremarks) {
        this.salesremarks = salesremarks;
    }

    public String getSalesstate() {
        return salesstate;
    }

    public void setSalesstate(String salesstate) {
        this.salesstate = salesstate;
    }

    public String getCreatdate() {
        return creatdate;
    }

    public void setCreatdate(String creatdate) {
        this.creatdate = creatdate;
    }

    public String getCreatuser() {
        return creatuser;
    }

    public void setCreatuser(String creatuser) {
        this.creatuser = creatuser;
    }

    public String getModifydate() {
        return modifydate;
    }

    public void setModifydate(String modifydate) {
        this.modifydate = modifydate;
    }

    public String getReviseuser() {
        return reviseuser;
    }

    public void setReviseuser(String reviseuser) {
        this.reviseuser = reviseuser;
    }

    public String getDeletstat() {
        return deletstat;
    }

    public void setDeletstat(String deletstat) {
        this.deletstat = deletstat;
    }

    public Integer getApprovalstate() {
        return approvalstate;
    }

    public void setApprovalstate(Integer approvalstate) {
        this.approvalstate = approvalstate;
    }
}
