package com.oasis.hrm.service.iservice;

import com.oasis.hrm.dao.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmpService {
    String save(Emp emp);
    String update(Emp emp);
    String delete(Integer eno);
    List<Emp> findByPage(@Param("page") int page,@Param("size") int size);
    List<Emp> findByName(String ename);
    Emp findById(Integer eno);
}
