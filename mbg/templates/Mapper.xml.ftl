<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE mapper
        PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="com.ftwl.ltp.dao.${className}Dao">
    <resultMap id="baseResultMap" extends="com.ftwl.ltp.dao.base.${className}BaseDao.baseResultMap" type="com.ftwl.ltp.model.entity.${className}"></resultMap>
    <sql id="baseColumnList">
        <include refid="com.ftwl.ltp.dao.base.${className}BaseDao.baseColumnList" />
    </sql>

</mapper>