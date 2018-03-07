package com.ftwl.ltp.service;

import com.ftwl.ltp.dao.base.PermissionBaseDao;
import com.ftwl.ltp.dao.PermissionDao;
import com.ftwl.frame.server.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ftwl.ltp.model.entity.Permission;
import org.springframework.transaction.annotation.Transactional;


/**
* 菜单表 业务逻辑层
* @author autoCoder
* @since 2018-03-05 16:24:36
*/
@Service
@Transactional
public class PermissionService extends BaseService<Permission> {

    @Autowired
    private PermissionDao dao;

    public PermissionService(PermissionBaseDao baseDao) {
        super(baseDao);
    }

}
