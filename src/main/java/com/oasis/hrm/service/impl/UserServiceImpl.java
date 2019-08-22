package com.oasis.hrm.service.impl;

import com.oasis.hrm.commons.Result;
import com.oasis.hrm.commons.ServerResponse;
import com.oasis.hrm.dao.UserDao;
import com.oasis.hrm.dao.pojo.User;
import com.oasis.hrm.service.iservice.IUserService;
import com.oasis.hrm.util.MD5Util;
import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements IUserService {
    @Autowired
    UserDao userDao;


    @Override
    public ServerResponse<User> login(String username, String password) {
       int result = userDao.exist(username);
       if (result == 0) {
           return ServerResponse.createErrorRespose("用户名不存在");
       }
       String md5Password = MD5Util.MD5EncodeUtf8(password);
        User resultCount = userDao.login(username,md5Password);
        if (resultCount == null) {
            return ServerResponse.createErrorRespose("密码错误");
        }
        return ServerResponse.createSuccessRespone("登陆成功",resultCount);
    }

    @Override
    public ServerResponse<User> exist(String username) {
        int result = userDao.exist(username);
        if (result > 0) {
            return ServerResponse.createSuccessRespose("用户名存在");
        }
        return ServerResponse.createErrorRespose("用户名不存在");
    }

    @Override
    public ServerResponse<User> register(User user) {
        ServerResponse response = this.checkValid(user.getUsername(),Result.USERNAME);
        if (!response.isSuccess()) {
            return response;
        }
        response = this.checkValid(user.getEmail(),Result.EMAIL);
        if (!response.isSuccess()) {
            return response;
        }
        int result = userDao.checkEmail(user.getEmail());
        if (result > 0) {
            return ServerResponse.createErrorRespose("Email存在");
        }
        user.setRole(Result.Role.ROLE_CUSTOMER);
        //password进行MD5加密
        user.setPassword(MD5Util.MD5EncodeUtf8(user.getPassword()));
        result = userDao.insert(user);
        if (result == 0) {
            return ServerResponse.createErrorRespose("注册失败");
        }
        return ServerResponse.createSuccessRespose("注册成功");
    }

    @Override
    public ServerResponse<String> checkValid(String str, String type) {
        if (StringUtils.isNotBlank(type)) {
            //开始校验
            if (Result.USERNAME.equals(type)) {
                int result = userDao.checkUserName(str);
                if (result > 0) {
                    return ServerResponse.createErrorRespose("用户名已存在");
                }
            }
            if (Result.EMAIL.equals(type)) {
                int result = userDao.checkEmail(str);
                if (result > 0) {
                    return ServerResponse.createErrorRespose("email已存在");
                }
            }
        } else {
            return ServerResponse.createErrorRespose("参数错误");
        }
        return ServerResponse.createSuccessRespose("校验成功");
    }
}
