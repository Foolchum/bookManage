package com.bookManage.pojo;

import javax.persistence.*;
import java.util.Date;

/**
 * 借阅记录表
 */
@Table(name="tb_borrow_record")
@Entity
public class BorrowRecord {

    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String workNo;//借阅处理人
    private String readNo;//借阅读者
    @Column(length = 20,name="ISBN")
    private String bookNo;//借阅书号
    private Date borrowTime;//借阅时间
    private Date returnTime;//还书时间
    private String remark;//备注
    private int borrowState;//借阅标志：0为未归还，1为归还，2为续借


    public int getBorrowState() {
        return borrowState;
    }

    public void setBorrowState(int borrowState) {
        this.borrowState = borrowState;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWorkNo() {
        return workNo;
    }

    public void setWorkNo(String workNo) {
        this.workNo = workNo;
    }

    public String getReadNo() {
        return readNo;
    }

    public void setReadNo(String readNo) {
        this.readNo = readNo;
    }

    public String getBookNo() {
        return bookNo;
    }

    public void setBookNo(String bookNo) {
        this.bookNo = bookNo;
    }

    public Date getBorrowTime() {
        return borrowTime;
    }

    public void setBorrowTime(Date borrowTime) {
        this.borrowTime = borrowTime;
    }

    public Date getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(Date returnTime) {
        this.returnTime = returnTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
