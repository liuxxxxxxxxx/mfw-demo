package com.qf.dao;

import com.qf.pojo.po.UserInfo;
import com.qf.pojo.vo.PageInfo;

import java.util.List;

public interface UserInfoDao {
    List<UserInfo> listUserInfoByPage(PageInfo info);
}
