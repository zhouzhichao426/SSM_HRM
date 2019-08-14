package com.oasis.hrm.service.iservice;

import com.oasis.hrm.dao.pojo.Emp;
import com.oasis.hrm.dao.pojo.Job;
import jdk.nashorn.internal.scripts.JO;

import java.util.List;

public interface JobService {
    String save(Job job);
    String delete(Integer jno);
    String update(Job job);
    List<Job> findByName(String jname);
    List<Job> findByPage(int page, int size);
    Job findById(Integer id);
    List<Emp> findEmp(String jname);
}
