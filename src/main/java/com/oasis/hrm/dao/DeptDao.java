package com.oasis.hrm.dao;

import com.oasis.hrm.dao.pojo.Dept;

public interface DeptDao {
    int deleteByPrimaryKey(Integer dno);

    int insert(Dept record);

    int insertSelective(Dept record);

    Dept selectByPrimaryKey(Integer dno);

    int updateByPrimaryKeySelective(Dept record);

    int updateByPrimaryKey(Dept record);
}