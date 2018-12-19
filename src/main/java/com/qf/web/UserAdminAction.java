package com.qf.web;

import com.qf.pojo.po.UserInfo;
import com.qf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@RequestMapping("admin/")
@Controller
public class UserAdminAction {
    @Autowired
    private UserService userService;

    @GetMapping("user/search")
    public UserInfo getUserByNickname(String nickname){
        List<UserInfo> userInfos = userService.listUsersByNickname(nickname);
        return null;
    }

    @PutMapping("user")
    public int editUserInfo(UserInfo userInfo){
        return userService.editUserInfo(userInfo);
    }
}
