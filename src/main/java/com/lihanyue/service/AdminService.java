package com.lihanyue.service;

import com.lihanyue.pojo.Admin;

public interface AdminService {
    //完成登录判断
    Admin login(String name, String pwd);
 
}
