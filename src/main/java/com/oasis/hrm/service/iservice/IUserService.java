package com.oasis.hrm.service.iservice;

import com.oasis.hrm.commons.ServerResponse;
import com.oasis.hrm.dao.pojo.User;

public interface IUserService {
    /**
     * 登录
     * @param username
     * @param password
     * @return
     */
    ServerResponse<User> login(String username, String password);

    /**
     * 用户名是否存在
     * @param username
     * @return
     */
    ServerResponse<User> exist(String username);

    /**
     * 注册
     * @param user
     * @return
     */
    ServerResponse<User> register(User user);

    /**
     * 注册时判断用户名或email是否可用
     * @param str
     * @param type
     * @return
     */
    ServerResponse<String> checkValid(String str, String type);
}
