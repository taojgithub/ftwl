package com.ftwl.ltp.service;

import com.ftwl.ltp.dao.base.RolePermissionBaseDao;
import com.ftwl.ltp.dao.RolePermissionDao;
import com.ftwl.frame.server.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ftwl.ltp.model.entity.RolePermission;
import org.springframework.transaction.annotation.Transactional;


/**
* 角色菜单表 业务逻辑层
* @author autoCoder
* @since 2018-03-05 16:23:57
*/
@Service
@Transactional
public class RolePermissionService extends BaseService<RolePermission> {

    @Autowired
    private RolePermissionDao dao;

    public RolePermissionService(RolePermissionBaseDao baseDao) {
        super(baseDao);
    }

}
