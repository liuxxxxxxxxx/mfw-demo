package com.qf.service.impl;

import com.qf.dao.UserAuthorMapper;
import com.qf.dao.UserImgMapper;
import com.qf.dao.UserInfoDao;
import com.qf.dao.UserInfoMapper;
import com.qf.pojo.po.*;
import com.qf.pojo.vo.AuthorVo;
import com.qf.pojo.vo.UserPageInfo;
import com.qf.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
    private final static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserInfoMapper userInfoMapper;
    @Autowired
    private UserAuthorMapper userAuthorMapper;
    @Autowired
    private UserInfoDao userInfoDao;
    @Autowired
    private UserImgMapper userImgMapper;

    @Override
    public List<UserInfo> listUsers() {
        UserInfoExample userInfoExample = new UserInfoExample();
        UserInfoExample.Criteria userInfoExampleCriteria = userInfoExample.createCriteria();
        userInfoExampleCriteria.andIdIsNotNull();
        return userInfoMapper.selectByExample(userInfoExample);
    }

    @Override
    public List<UserAuthor> listUserAuthors(String userINfoId) {
        UserAuthorExample userAuthorExample = new UserAuthorExample();
        UserAuthorExample.Criteria userAuthorExampleCriteria = userAuthorExample.createCriteria();
        userAuthorExampleCriteria.andUserInfoIdEqualTo(userINfoId);
        return userAuthorMapper.selectByExample(userAuthorExample);
    }

    @Override
    public int addUser(UserInfo user) {
        return 0;
    }

    @Override
    public int updateUserInfo(@RequestBody UserInfo userInfo) {
        if (userInfo.getId() == null) {
            return 0;
        } else {
            userInfo.setCreateTime(null);
            return userInfoMapper.updateByPrimaryKeySelective(userInfo);
        }
    }

    @Override
    public int updateUserAuthor(UserAuthor userAuthor) {
        if (userAuthor.getId() == null) {
            return 0;
        } else {
            return userAuthorMapper.updateByPrimaryKeySelective(userAuthor);
        }
    }

    @Override
    public int getUserCount() {
        UserInfoExample userInfoExample = new UserInfoExample();
        UserInfoExample.Criteria userInfoExampleCriteria = userInfoExample.createCriteria();
        userInfoExampleCriteria.andIdIsNotNull();
        return (int) userInfoMapper.countByExample(userInfoExample);
    }

    @Override
    public List<UserInfo> listUserByPage(UserPageInfo info) {
        return userInfoDao.listUserInfoByPage(info);

    }

    @Override
    public List<UserInfo> listUsersByNickname(String nickname) {
        UserInfoExample userInfoExample = new UserInfoExample();
        UserInfoExample.Criteria userInfoExampleCriteria = userInfoExample.createCriteria();
        userInfoExampleCriteria.andNicknameLike(nickname);
        return userInfoMapper.selectByExample(userInfoExample);
    }

    @Override
    public UserInfo login(AuthorVo data) {
        UserAuthorExample authorExample = new UserAuthorExample();
        UserAuthorExample.Criteria authorExampleCriteria = authorExample.createCriteria();
        authorExampleCriteria.andAuthorTypeEqualTo(data.getLoginType());
        authorExampleCriteria.andTypeIdEqualTo(data.getTypeId());
        authorExampleCriteria.andCommandEqualTo(data.getCommand());
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

    @Transactional
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
            return 3;
        } else {
            String uuid = UUID.randomUUID().toString();
            UserInfo userInfo = new UserInfo();
            userInfo.setId(uuid);
            data.setUserInfoId(uuid);
            userInfoMapper.insertSelective(userInfo);
            return userAuthorMapper.insertSelective(data);
        }
    }

    @Override
    public String getUserInfoId(int index) {
        UserAuthor userAuthor = userAuthorMapper.selectByPrimaryKey(index);

        return userAuthor.getUserInfoId();
    }

    @Override
    public UserImg getImgUrl(int i) {
        return userImgMapper.selectByPrimaryKey(i);

    }
}
