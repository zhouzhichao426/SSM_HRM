package com.oasis.hrm.service.impl;

import com.oasis.hrm.service.iservice.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class UserServiceImplTest {
    @Autowired
    IUserService userService;

    @Test
    public void login() {
        System.err.println(userService.login("admin","admin"));
    }

    @Test
    public void exist() {
        System.err.println("-----------------------------------------------");
        System.err.println(userService.exist("admin"));
    }
}