package com.ftwl.ltp.model.entity;

import com.ftwl.frame.server.dao.BaseEntity;
<#list table.columnList as field><#if field.variableName=='updateUser'>import com.ftwl.frame.server.dao.Recordable;<#break></#if></#list>
<#list table.columnList as field><#if field.javaType=='Date'>import java.util.Date;<#break></#if></#list>

/**
* ${table.remark}
* @author ${author}
* @since ${dateTime}
*/
public class ${className} implements <#list table.columnList as field><#if field.variableName=='updateUser'>Recordable, <#break></#if></#list>BaseEntity {

<#list table.columnList as field>
    <#if field.name != 'AUTO_ID'>
    private ${field.javaType} ${field.variableName}; //${field.remark}
    </#if>
</#list>

<#list table.columnList as field>
    <#if field.name != 'AUTO_ID'>
    public ${field.javaType} get${field.className}() {
        return ${field.variableName};
    }

    public void set${field.className}(${field.javaType} ${field.variableName}) {
        this.${field.variableName} = ${field.variableName};
    }
   </#if>
</#list>

}
