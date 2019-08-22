package com.oasis.hrm.dao.pojo;

public class HRMReportBO {
    private Edu edu;
    private PersonNum personNum;
    private Emp emp;

    @Override
    public String toString() {
        return "HRMReportBO{" +
                "edu=" + edu +
                ", personNum=" + personNum +
                ", emp=" + emp +
                '}';
    }

    public Edu getEdu() {
        return edu;
    }

    public void setEdu(Edu edu) {
        this.edu = edu;
    }

    public PersonNum getPersonNum() {
        return personNum;
    }

    public void setPersonNum(PersonNum personNum) {
        this.personNum = personNum;
    }

    public Emp getEmp() {
        return emp;
    }

    public void setEmp(Emp emp) {
        this.emp = emp;
    }

    public HRMReportBO(Edu edu, PersonNum personNum, Emp emp) {
        this.edu = edu;
        this.personNum = personNum;
        this.emp = emp;
    }

    public HRMReportBO() {
    }
}
