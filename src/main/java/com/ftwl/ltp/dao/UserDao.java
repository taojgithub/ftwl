package com.ftwl.ltp.dao;

import com.ftwl.ltp.model.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
* 用户表 数据层
* @author autoCoder
* @since 2018-03-05 16:24:35
*/
@Mapper
public interface UserDao {

    User getUserbyUserName(@Param(value = "userName") String userName);
}
