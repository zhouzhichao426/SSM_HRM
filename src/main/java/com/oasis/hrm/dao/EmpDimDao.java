package com.oasis.hrm.dao;

import com.oasis.hrm.dao.pojo.EmpDim;

public interface EmpDimDao {
    int deleteByPrimaryKey(Integer eno);

    int insert(EmpDim record);

    int insertSelective(EmpDim record);

    EmpDim selectByPrimaryKey(Integer eno);

    int updateByPrimaryKeySelective(EmpDim record);

    int updateByPrimaryKey(EmpDim record);
}