package com.qf.service;

import com.qf.pojo.vo.AuthorVo;
import com.qf.pojo.po.UserAuthor;
import com.qf.pojo.po.UserInfo;
import com.qf.pojo.vo.PageInfo;

import java.util.List;

public interface UserService {
    List<UserInfo> listUsers();

    List<UserAuthor> listUserAuthors(String userInfoId);

    int addUser(UserInfo user);

    int editUserInfo(UserInfo user);

    int editUserAuthor(UserAuthor userAuthor);

    int getUserCount();

    List<UserInfo> listUserByPage(PageInfo info);

    UserInfo login(AuthorVo data);

    int register(UserAuthor data);

    List<UserInfo> listUsersByNickname(String nickname);

    String getUserInfoId(int Index);
}
