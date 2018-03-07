<#assign entityPath="com.ftwl.ltp.model.entity.${className}">
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE mapper
        PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="com.ftwl.ltp.dao.base.${className}BaseDao">
    <resultMap id="baseResultMap" type="${entityPath}">
        <id column="ID" property="id" />
    <#list table.columnList as field>
        <#if field.name != 'AUTO_ID'>
        <#if field.name != 'ID'>
            <result column="${field.name}" property="${field.variableName}"/>
        </#if>
        </#if>
    </#list>
    </resultMap>
    <sql id="baseColumnList">
    <#list table.columnList as field><#if field.name != 'AUTO_ID'>${field.name}<#if field_has_next>,</#if></#if></#list>
    </sql>
    <select id="get" parameterType="java.lang.String" resultMap="baseResultMap">
        select <include refid="baseColumnList"/>
        from ${table.name}
        where ID = ${'#'}{id}
    </select>
    <delete id="delete" parameterType="java.util.Collection">
        delete from ${table.name}
        where 1=1 and ID in
        <foreach close=")" collection="list" index="index" item="item" open="(" separator=",">
        ${'#'}{item}
        </foreach>
    </delete>
    <insert id="insert" parameterType="${entityPath}">
        insert into ${table.name} (
    <#list table.columnList as field><#if field.name != 'AUTO_ID'>
    ${field.name}<#if field_has_next>,</#if>
    </#if>
    </#list>
        )
        values (
    <#list table.columnList as field><#if field.name != 'AUTO_ID'>
    ${'#'}{${field.variableName}, jdbcType=${field.xmlType}}<#if field_has_next>,</#if>
    </#if>
    </#list>
        )
    </insert>
    <insert id="insertSelective" parameterType="${entityPath}">
        insert into ${table.name}
        <trim prefix="(" suffix=")" suffixOverrides=",">
        <#list table.columnList as field><#if field.name != 'AUTO_ID'>
            <if test="${field.variableName} != null">
            ${field.name},
            </if>
        </#if>
        </#list>
        </trim>
        <trim prefix="values (" suffix=")" suffixOverrides=",">
        <#list table.columnList as field><#if field.name != 'AUTO_ID'>
            <if test="${field.variableName} != null">
            ${'#'}{${field.variableName}, jdbcType=${field.xmlType}},
            </if>
        </#if>
        </#list>
        </trim>
    </insert>
    <insert id="insertBatch" parameterType="java.util.List">
        insert into ${table.name} (<#list table.columnList as field><#if field.name != 'AUTO_ID'>${field.name}<#if field_has_next>,</#if></#if></#list>
        )
        values
        <foreach collection="list" item="item" index="index" separator=",">
            (
        <#list table.columnList as field><#if field.name != 'AUTO_ID'>
        ${'#'}{item.${field.variableName}, jdbcType=${field.xmlType}}<#if field_has_next>,</#if>
        </#if>
        </#list>
            )
        </foreach>
    </insert>
    <update id="update" parameterType="${entityPath}">
        update ${table.name}
        <set>
        <#list table.columnList as field><#if field.name != 'AUTO_ID'>
            <#if field.name != 'ID'>
            ${field.name} = ${'#'}{${field.variableName}, jdbcType=${field.xmlType}}<#if field_has_next>,</#if>
            </#if>
        </#if>
        </#list>
        </set>
        where ID = ${'#'}{id}
    </update>
    <update id="updateSelective" parameterType="${entityPath}">
        update ${table.name}
        <set>
        <#list table.columnList as field><#if field.name != 'AUTO_ID'>
            <#if field.name != 'ID'>
                <if test="${field.variableName} != null">
                ${field.name} = ${'#'}{${field.variableName}, jdbcType=${field.xmlType}}<#if field_has_next>,</#if>
                </if>
            </#if>
        </#if>
        </#list>
        </set>
        where ID = ${'#'}{id}
    </update>
    <update id="updateBatch" parameterType="java.util.List">
        insert into ${table.name} (<#list table.columnList as field><#if field.name != 'AUTO_ID'>${field.name}<#if field_has_next>,</#if></#if></#list>
        )
        values
        <foreach collection="list" item="item" index="index" separator=",">
            (
        <#list table.columnList as field><#if field.name != 'AUTO_ID'>
        ${'#'}{item.${field.variableName}, jdbcType=${field.xmlType}}<#if field_has_next>,</#if>
        </#if>
        </#list>
            )
        </foreach>
        ON DUPLICATE KEY UPDATE
        ID = IF(ID = VALUES(ID),ID,NULL)
    <#list table.columnList as field><#if field.name != 'AUTO_ID'>
        <#if field.name != 'ID'>
            ,${field.name} = VALUES(${field.name})
        </#if>
    </#if>
    </#list>
    </update>
    <select id="listByEntity" parameterType="${entityPath}" resultMap="baseResultMap">
        select <include refid="baseColumnList"/>
        from ${table.name}
        where 1=1
    <#list table.columnList as field><#if field.name != 'AUTO_ID'>
        <#if field.name != 'ID'>
            <if test="${field.variableName} != null">
                AND ${field.name} = ${'#'}{${field.variableName}}
            </if>
        </#if>
    </#if>
    </#list>
    </select>
    <update id="updateField">
        update ${table.name}
        <set>
        <#list table.columnList as field><#if field.name != 'AUTO_ID'>
            <#if field.name != 'ID'&&field.name != 'CREATE_USER'&&field.name != 'CREATE_TIME'&&field.name != 'REAL_CREATE_USER'>
                <if test="param2.${field.variableName}">
                ${field.name} = ${'#'}{param1.${field.variableName}, jdbcType=${field.xmlType}},
                </if>
            </#if>
        </#if>
        </#list>
        </set>
        where ID = ${'#'}{param1.id}
    </update>
</mapper>