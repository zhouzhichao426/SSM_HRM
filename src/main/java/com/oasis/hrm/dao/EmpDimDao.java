package com.oasis.hrm.dao;

import com.oasis.hrm.dao.pojo.Emp;
import com.oasis.hrm.dao.pojo.EmpDim;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface EmpDimDao {
    int deleteByPrimaryKey(Integer eno);

    int insert(EmpDim record);

    int insertSelective(EmpDim record);

    EmpDim selectByPrimaryKey(Integer eno);

    int updateByPrimaryKeySelective(EmpDim record);

    int updateByPrimaryKey(EmpDim record);

    List<EmpDim> findAll();

    List<EmpDim> findByType(String edtype);

    Emp findEmp(@Param("eno")Integer eno);

}