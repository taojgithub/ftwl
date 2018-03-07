package com.ftwl.ltp.service;

import com.ftwl.ltp.dao.base.${className}BaseDao;
import com.ftwl.ltp.dao.${className}Dao;
import com.ftwl.frame.server.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ftwl.ltp.model.entity.${className};
import org.springframework.transaction.annotation.Transactional;


/**
* ${table.remark} 业务逻辑层
* @author ${author}
* @since ${dateTime}
*/
@Service
@Transactional
public class ${className}Service extends BaseService<${className}> {

    @Autowired
    private ${className}Dao dao;

    public ${className}Service(${className}BaseDao baseDao) {
        super(baseDao);
    }

}
