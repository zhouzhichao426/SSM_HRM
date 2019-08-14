package com.oasis.hrm.dao;

import com.oasis.hrm.dao.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmpDao {
    int deleteByPrimaryKey(Integer eno);

    int insert(Emp record);

    int insertSelective(Emp record);

    Emp selectByPrimaryKey(Integer eno);

    int updateByPrimaryKeySelective(Emp record);

    int updateByPrimaryKey(Emp record);

    List<Emp> findAll();

    List<Emp> findByName(@Param("ename") String ename);

    List<Emp> findByEmp(@Param("dname") String dname);
}