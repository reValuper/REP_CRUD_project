package com.revaluper.rep_crud_project.report.model.dto;


import java.io.Serializable;
import java.util.Date;

public class ReportDTO implements Serializable {

    private int repNo;              // 신고번호
    private String repTitle;        // 신고 제목
    private String repContent;      // 신고내용
    private Date repDate;           // 신고날짜
    private String repId;           // 신고아이디
    private String repPrc;          // 신고처리여부

    public ReportDTO() {
    }

    public ReportDTO(int repNo, String repTitle, String repContent, Date repDate, String repId, String repPrc) {
        this.repNo = repNo;
        this.repTitle = repTitle;
        this.repContent = repContent;
        this.repDate = repDate;
        this.repId = repId;
        this.repPrc = repPrc;
    }

    public int getRepNo() {
        return repNo;
    }

    public void setRepNo(int repNo) {
        this.repNo = repNo;
    }

    public String getRepTitle() {
        return repTitle;
    }

    public void setRepTitle(String repTitle) {
        this.repTitle = repTitle;
    }

    public String getRepContent() {
        return repContent;
    }

    public void setRepContent(String repContent) {
        this.repContent = repContent;
    }

    public Date getRepDate() {
        return repDate;
    }

    public void setRepDate(Date repDate) {
        this.repDate = repDate;
    }

    public String getRepId() {
        return repId;
    }

    public void setRepId(String repId) {
        this.repId = repId;
    }

    public String getRepPrc() {
        return repPrc;
    }

    public void setRepPrc(String repPrc) {
        this.repPrc = repPrc;
    }

    @Override
    public String toString() {
        return "ReportDTO{" +
                "repNo=" + repNo +
                ", repTitle='" + repTitle + '\'' +
                ", repContent='" + repContent + '\'' +
                ", repDate=" + repDate +
                ", repId='" + repId + '\'' +
                ", repPrc='" + repPrc + '\'' +
                '}';
    }
}
