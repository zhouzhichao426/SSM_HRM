package com.oasis.hrm.dao.pojo;

import java.util.Date;

public class EmpDim {
    private Integer eno;

    private Date eddate;

    private String edtype;

    private String edtalent;

    public EmpDim(Integer eno, Date eddate, String edtype, String edtalent) {
        this.eno = eno;
        this.eddate = eddate;
        this.edtype = edtype;
        this.edtalent = edtalent;
    }

    public EmpDim() {
        super();
    }

    public Integer getEno() {
        return eno;
    }

    public void setEno(Integer eno) {
        this.eno = eno;
    }

    public Date getEddate() {
        return eddate;
    }

    public void setEddate(Date eddate) {
        this.eddate = eddate;
    }

    public String getEdtype() {
        return edtype;
    }

    public void setEdtype(String edtype) {
        this.edtype = edtype == null ? null : edtype.trim();
    }

    public String getEdtalent() {
        return edtalent;
    }

    public void setEdtalent(String edtalent) {
        this.edtalent = edtalent == null ? null : edtalent.trim();
    }
}