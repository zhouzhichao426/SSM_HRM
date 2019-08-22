package com.oasis.hrm.dao;

import com.oasis.hrm.dao.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserDao {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User login(@Param("username") String username,@Param("password") String password);

    int exist(@Param("username") String username);

    int checkUserName(String str);

    int checkEmail(String str);
}