package com.ftwl.ltp.service;

import com.ftwl.ltp.dao.base.UserRoleBaseDao;
import com.ftwl.ltp.dao.UserRoleDao;
import com.ftwl.frame.server.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ftwl.ltp.model.entity.UserRole;
import org.springframework.transaction.annotation.Transactional;


/**
* 用户角色关联表 业务逻辑层
* @author autoCoder
* @since 2018-03-05 16:24:36
*/
@Service
@Transactional
public class UserRoleService extends BaseService<UserRole> {

    @Autowired
    private UserRoleDao dao;

    public UserRoleService(UserRoleBaseDao baseDao) {
        super(baseDao);
    }

}
