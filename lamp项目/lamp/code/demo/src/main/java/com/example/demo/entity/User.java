package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "PSD_USER_INFO")
public class User {

    @Id
    @Column(name = "ROW_ID")
    private String rowId;

    @Column(name = "USER_ID")
    private String userId;

    @Column(name = "USER_PSD")
    private String userPsd;

    @Column(name = "USER_NAME")
    private String userName;

    @Column(name = "USER_ROLE")
    private String userRole;

    @Column(name = "CREAT_DATE")
    private String createDate;

    @Column(name = "CRTAT_USER")
    private String createUserId;

    @Column(name = "MODIFY_DATE")
    private String modifyDate;

    @Column(name = "REVISE_USER")
    private String reviseUser;

    @Column(name = "DELET_STATE")
    private int delStage;


    public User() {
    }

    public User(String rowId, String userId, String userPsd, String userName, String userRole, int delStage) {
        this.rowId = rowId;
        this.userId = userId;
        this.userPsd = userPsd;
        this.userName = userName;
        this.userRole = userRole;
        this.delStage = delStage;
    }

    public String getRowId() {
        return rowId;
    }

    public void setRowId(String rowId) {
        this.rowId = rowId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPsd() {
        return userPsd;
    }

    public void setUserPsd(String userPsd) {
        this.userPsd = userPsd;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    public String getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(String modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getReviseUser() {
        return reviseUser;
    }

    public void setReviseUser(String reviseUser) {
        this.reviseUser = reviseUser;
    }

    public int getDelStage() {
        return delStage;
    }

    public void setDelStage(int delStage) {
        this.delStage = delStage;
    }

    @Override
    public String toString() {
        return "User{" +
                "rowId='" + rowId + '\'' +
                ", userId='" + userId + '\'' +
                ", userPsd='" + userPsd + '\'' +
                ", userName='" + userName + '\'' +
                ", userRole='" + userRole + '\'' +
                ", createDate='" + createDate + '\'' +
                ", createUserId='" + createUserId + '\'' +
                ", modifyDate='" + modifyDate + '\'' +
                ", reviseUser='" + reviseUser + '\'' +
                ", delStage=" + delStage +
                '}';
    }
}
