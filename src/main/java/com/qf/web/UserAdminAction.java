package com.qf.web;

import com.qf.pojo.po.UserInfo;
import com.qf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserAdminAction {
    @Autowired
    private UserService userService;

    public UserInfo getUserByKey(String key){
        return null;
    }
}
