package com.ftwl.ltp.service;

import com.ftwl.ltp.dao.base.RoleBaseDao;
import com.ftwl.ltp.dao.RoleDao;
import com.ftwl.frame.server.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ftwl.ltp.model.entity.Role;
import org.springframework.transaction.annotation.Transactional;


/**
* 角色表 业务逻辑层
* @author autoCoder
* @since 2018-03-05 16:24:35
*/
@Service
@Transactional
public class RoleService extends BaseService<Role> {

    @Autowired
    private RoleDao dao;

    public RoleService(RoleBaseDao baseDao) {
        super(baseDao);
    }

}
