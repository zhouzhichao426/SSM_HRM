package com.oasis.hrm.dao.pojo;

public class Edu {
    private Integer master;
    private Integer banchelor;
    private Integer college;
    private Integer senior;

    @Override
    public String toString() {
        return "Edu{" +
                "master=" + master +
                ", banchelor=" + banchelor +
                ", college=" + college +
                ", senior=" + senior +
                '}';
    }

    public Integer getMaster() {
        return master;
    }

    public void setMaster(Integer master) {
        this.master = master;
    }

    public Integer getBanchelor() {
        return banchelor;
    }

    public void setBanchelor(Integer banchelor) {
        this.banchelor = banchelor;
    }

    public Integer getCollege() {
        return college;
    }

    public void setCollege(Integer college) {
        this.college = college;
    }

    public Integer getSenior() {
        return senior;
    }

    public void setSenior(Integer senior) {
        this.senior = senior;
    }

    public Edu(Integer master, Integer banchelor, Integer college, Integer senior) {
        this.master = master;
        this.banchelor = banchelor;
        this.college = college;
        this.senior = senior;
    }

    public Edu() {
    }
}
