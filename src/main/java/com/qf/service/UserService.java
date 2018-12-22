package com.qf.service;

import com.qf.pojo.po.UserImg;
import com.qf.pojo.vo.AuthorVo;
import com.qf.pojo.po.UserAuthor;
import com.qf.pojo.po.UserInfo;
import com.qf.pojo.vo.UserPageInfo;

import java.util.List;

public interface UserService {
    List<UserInfo> listUsers();

    List<UserAuthor> listUserAuthors(String userInfoId);

    int addUser(UserInfo user);

    int updateUserInfo(UserInfo user);

    int updateUserAuthor(UserAuthor userAuthor);

    int getUserCount();

    List<UserInfo> listUserByPage(UserPageInfo info);

    UserInfo login(AuthorVo data);

    int register(UserAuthor data);

    List<UserInfo> listUsersByNickname(String nickname);

    String getUserInfoId(int Index);

    UserImg getImgUrl(int i);
}
