package com.ftwl.ltp.model.field;

import com.ftwl.frame.server.dao.BaseField;

/**
* ${table.remark}表字段
* @author ${author}
* @since ${dateTime}
*/
public final class ${className}Field extends BaseField {

    private ${className}Field() {
        super();
    }

    public static ${className}Field update() {
        return new ${className}Field();
    }
<#list table.columnList as field>
    <#if field.name != 'AUTO_ID'>
    <#if field.name != 'ID'&&field.name != 'CREATE_USER'&&field.name != 'CREATE_TIME'&&field.name != 'REAL_CREATE_USER'>

    public ${className}Field ${field.variableName}() {
        this.addField("${field.variableName}");
        return this;
    }
    </#if>
    </#if>
</#list>

}
