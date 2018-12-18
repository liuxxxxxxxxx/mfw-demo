package com.qf.service.impl;

import com.qf.dao.UserAuthorMapper;
import com.qf.dao.UserInfoMapper;
import com.qf.pojo.po.*;
import com.qf.service.UserService;
import org.apache.ibatis.jdbc.Null;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
    private final static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserInfoMapper userInfoMapper;
    @Autowired
    private UserAuthorMapper userAuthorMapper;

    @Override
    public List<UserInfo> ListUsers() {
        return null;
    }

    @Override
    public int addUser(UserInfo user) {
        return 0;
    }

    @Override
    public int editUser(UserInfo user) {
        return 0;
    }

    @Override
    public int logicalDeleteUser(UserInfo user) {
        return 0;
    }

    @Override
    public int getUsersCount() {
        return 0;
    }

    @Override
    public List<UserInfo> listUserByPage(int pageindex, int pagesize) {
        return null;
    }

    @Override
    public UserInfo login(AuthorVo data) {
        UserAuthorExample authorExample = new UserAuthorExample();
        UserAuthorExample.Criteria authorExampleCriteria = authorExample.createCriteria();
        authorExampleCriteria.andAuthorTypeEqualTo(data.getLoginType());
        authorExampleCriteria.andTypeIdEqualTo(data.getId());
        authorExampleCriteria.andCommandEqualTo(data.getTypeCommand());
        List<UserAuthor> userAuthors = userAuthorMapper.selectByExample(authorExample);
        if (userAuthors.size() > 0) {
            UserAuthor userAuthor = userAuthors.get(0);
            return userInfoMapper.selectByPrimaryKey(userAuthor.getUserInfoId());
        } else {
            UserInfo userInfo = new UserInfo();
            userInfo.setId("0");
            return userInfo;
        }
    }

    @Override
    public int register(UserAuthor data) {
        if (data.getAuthorType() == null || data.getTypeId() == null || data.getId() != null || data.getIdentify() != null
                || data.getStatus() != null || data.getUserInfoId() != null) {
            return 2;
        }
        UserAuthorExample authorExample = new UserAuthorExample();
        UserAuthorExample.Criteria authorExampleCriteria = authorExample.createCriteria();
        authorExampleCriteria.andAuthorTypeEqualTo(data.getAuthorType());
        authorExampleCriteria.andTypeIdEqualTo(data.getTypeId());
        List<UserAuthor> userAuthors = userAuthorMapper.selectByExample(authorExample);
        if (userAuthors.size() > 0) {
            return 2;
        } else {
            String uuid = UUID.randomUUID().toString();
            UserInfo userInfo = new UserInfo();
            userInfo.setId(uuid);
            data.setUserInfoId(uuid);
            userInfoMapper.insertSelective(userInfo);
            return userAuthorMapper.insertSelective(data);
        }
    }
}
