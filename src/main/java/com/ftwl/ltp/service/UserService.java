package com.ftwl.ltp.service;

import com.ftwl.ltp.dao.base.UserBaseDao;
import com.ftwl.ltp.dao.UserDao;
import com.ftwl.frame.server.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ftwl.ltp.model.entity.User;
import org.springframework.transaction.annotation.Transactional;


/**
* 用户表 业务逻辑层
* @author autoCoder
* @since 2018-03-05 16:24:35
*/
@Service
@Transactional
public class UserService extends BaseService<User> {

    @Autowired
    private UserDao dao;

    public UserService(UserBaseDao baseDao) {
        super(baseDao);
    }

    public User getUserByUserName(User entity) {
        entity = dao.getUserbyUserName(entity.getUserName());
        return entity;
    }
}
