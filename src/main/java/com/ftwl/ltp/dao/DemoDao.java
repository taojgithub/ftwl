package com.ftwl.ltp.dao;

import com.ftwl.ltp.model.entity.Demo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* 表未注释 数据层
* @author autoCoder
* @since 2018-03-04 11:42:16
*/
@Mapper
public interface DemoDao {

    List<Demo> listByCode(@Param("code") String code);
}
