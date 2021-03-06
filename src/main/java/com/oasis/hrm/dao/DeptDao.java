package com.oasis.hrm.dao;

import com.oasis.hrm.dao.pojo.Dept;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeptDao {
    int deleteByPrimaryKey(int dno);

    int insert(Dept record);

    int insertSelective(Dept record);

    Dept selectByPrimaryKey(Integer dno);

    int updateByPrimaryKeySelective(Dept record);

    int updateByPrimaryKey(Dept record);

    List<Dept> findAll();

    List<Dept> findByName(@Param("dname") String dname);

    List<Dept> findByDeptType(@Param("dtype") String dtype);



}