package com.qf.web;

import com.qf.pojo.po.UserAuthor;
import com.qf.pojo.po.UserInfo;
import com.qf.pojo.vo.PageInfo;
import com.qf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/user")
@Controller
public class UserAdminAction {
    @Autowired
    private UserService userService;

    @GetMapping("/admin")
    @ResponseBody
    public List<UserInfo> listUserInfoByPage(@RequestParam String pageIndex, @RequestParam String pageSize) {
        PageInfo pageInfo = new PageInfo();
        pageInfo.setPageIndex(Integer.parseInt(pageIndex));
        pageInfo.setPageSize(Integer.parseInt(pageSize));
        return userService.listUserByPage(pageInfo);
    }

    @GetMapping("/admin/author")
    @ResponseBody
    public List<UserAuthor> listUserAuthor(@RequestParam String userInfoId) {
        return userService.listUserAuthors(userInfoId);
    }

    @GetMapping("/admin/search")
    @ResponseBody
    public List<UserInfo> getUserByNickname(@RequestParam String nickname) {
        return userService.listUsersByNickname("%"+nickname+"%");
    }

    @PutMapping("/admin")
    @ResponseBody
    public int editUserInfo(UserInfo userInfo) {
        return userService.editUserInfo(userInfo);
    }

    @PutMapping("/admin/author")
    @ResponseBody
    public int editUserAuthor(UserAuthor userAuthor) {
        return userService.editUserAuthor(userAuthor);
    }

    @GetMapping("/admin/count")
    @ResponseBody
    public int countUsers() {
        return userService.getUserCount();
    }


}
