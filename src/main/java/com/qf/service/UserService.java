package com.qf.service;

import com.qf.pojo.po.AuthorVo;
import com.qf.pojo.po.UserAuthor;
import com.qf.pojo.po.UserInfo;

import java.util.List;

public interface UserService {
    List<UserInfo> ListUsers();

    int addUser(UserInfo user);

    int editUser(UserInfo user);

    int logicalDeleteUser(UserInfo user);

    int getUsersCount();

    List<UserInfo> listUserByPage(int pageindex, int pagesize);

    UserInfo login(AuthorVo data);

    int register(UserAuthor data);
}
