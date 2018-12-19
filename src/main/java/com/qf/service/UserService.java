package com.qf.service;

import com.qf.pojo.vo.AuthorVo;
import com.qf.pojo.po.UserAuthor;
import com.qf.pojo.po.UserInfo;

import java.util.List;

public interface UserService {
    List<UserInfo> listUsers();

    List<UserAuthor> listUserAuthors(String userInfoId);

    int addUser(UserInfo user);

    int editUserInfo(UserInfo user);

    int getUserCount();

    List<UserInfo> listUserByPage(int pageindex, int pagesize);

    UserInfo login(AuthorVo data);

    int register(UserAuthor data);

    List<UserInfo> listUsersByNickname(String nickname);
}
