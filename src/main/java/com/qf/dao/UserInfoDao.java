package com.qf.dao;

import com.qf.pojo.po.UserInfo;
import com.qf.pojo.vo.UserPageInfo;

import java.util.List;

public interface UserInfoDao {
    List<UserInfo> listUserInfoByPage(UserPageInfo info);
}
