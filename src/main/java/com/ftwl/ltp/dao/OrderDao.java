package com.ftwl.ltp.dao;

import com.ftwl.ltp.model.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* 培训测试表 数据层
* @author autoCoder
* @since 2018-03-04 15:43:36
*/
@Mapper
public interface OrderDao {

    public List<Order> listOrder(@Param(value = "name") String name);

}
