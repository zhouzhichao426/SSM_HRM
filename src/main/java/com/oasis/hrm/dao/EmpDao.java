package com.oasis.hrm.dao;

import com.oasis.hrm.dao.pojo.Emp;

public interface EmpDao {
    int deleteByPrimaryKey(Integer eno);

    int insert(Emp record);

    int insertSelective(Emp record);

    Emp selectByPrimaryKey(Integer eno);

    int updateByPrimaryKeySelective(Emp record);

    int updateByPrimaryKey(Emp record);
}