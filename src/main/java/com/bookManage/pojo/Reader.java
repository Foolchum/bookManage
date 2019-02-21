package com.bookManage.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "tb_reader")
@Entity
public class Reader {

    @Id
    private String readerNo;
    private String password;
    private String name;
    private String sex;
    private String tel;
    private String department;//院系
    private String major;
    private int identity;//读者身份:1为学生，2为老师
    private int readerState;//读者状态:1为有效，0为失效
    private int illegalState;//违章状态：1为违章，0为正常
    private String remark;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getIdentity() {
        return identity;
    }

    public void setIdentity(int identity) {
        this.identity = identity;
    }

    public int getIllegalState() {
        return illegalState;
    }

    public void setIllegalState(int illegalState) {
        this.illegalState = illegalState;
    }

    public String getReaderNo() {
        return readerNo;
    }

    public void setReaderNo(String readerNo) {
        this.readerNo = readerNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getReaderState() {
        return readerState;
    }

    public void setReaderState(int readerState) {
        this.readerState = readerState;
    }
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }


}
