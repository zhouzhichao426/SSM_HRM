package com.oasis.hrm.commons;

public class Result {
    public static final String SUCCESS="success";
    public static final String ERROR="error";
    public static final String LOGIN="login";
    public static final String EMAIL = "email";
    public static final String USERNAME = "username";

    public interface Role {
        int ROLE_CUSTOMER = 0; //普通用户
        int ROLE_ADMIN = 1;//管理员
    }
}
