package com.oasis.hrm.action;

import com.oasis.hrm.commons.Result;
import com.oasis.hrm.commons.ServerResponse;
import com.oasis.hrm.dao.pojo.User;
import com.oasis.hrm.service.iservice.IUserService;
import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user/")
public class UserAction {

    @Autowired
    IUserService userService;

    @RequestMapping(value = "exist.do", method = RequestMethod.POST)
    public @ResponseBody
    ServerResponse<User> exist(String username) {
        return userService.exist(username);
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public @ResponseBody
    ServerResponse<User> login(String username, String password, HttpSession session) {
        ServerResponse<User> user = userService.login(username, password);
        if (user.isSuccess()) {
            return ServerResponse.createSuccessRespone(Result.LOGIN, user.getData());
        }
        return user;
    }

    @RequestMapping(value = "logout.do", method = RequestMethod.POST)
    public @ResponseBody
    ServerResponse<User> logout(HttpSession session) {
        session.removeAttribute(Result.LOGIN);
        return ServerResponse.createSuccessRespose("已退出");
    }

    @RequestMapping(value = "register.do",method = RequestMethod.POST)
    public @ResponseBody
    ServerResponse<User> register(User user) {
        return userService.register(user);
    }
}
