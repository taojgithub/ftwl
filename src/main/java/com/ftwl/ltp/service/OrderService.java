package com.ftwl.ltp.service;

import com.ftwl.ltp.dao.base.OrderBaseDao;
import com.ftwl.ltp.dao.OrderDao;
import com.ftwl.frame.server.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ftwl.ltp.model.entity.Order;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


/**
* 培训测试表 业务逻辑层
* @author autoCoder
* @since 2018-03-04 15:43:36
*/
@Service
@Transactional
public class OrderService extends BaseService<Order> {

    @Autowired
    private OrderDao dao;

    public OrderService(OrderBaseDao baseDao) {
        super(baseDao);
    }

    public List<Order> listOrder(String name){
        List<Order> list = dao.listOrder(name);
        return list;
    }

}
