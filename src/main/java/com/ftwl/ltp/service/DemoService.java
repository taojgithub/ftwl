package com.ftwl.ltp.service;

import com.ftwl.ltp.dao.base.DemoBaseDao;
import com.ftwl.ltp.dao.DemoDao;
import com.ftwl.frame.server.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ftwl.ltp.model.entity.Demo;
import org.springframework.transaction.annotation.Transactional;


/**
* 表未注释 业务逻辑层
* @author autoCoder
* @since 2018-03-04 11:48:42
*/
@Service
@Transactional
public class DemoService extends BaseService<Demo> {

    @Autowired
    private DemoDao dao;

    public DemoService(DemoBaseDao baseDao) {
        super(baseDao);
    }

}
