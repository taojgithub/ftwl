实体类说明： ${table.remark}  since ${dateTime}
<#list table.columnList as field>
<#if field.name != 'AUTO_ID'>
${field.variableName}	${field.remark}
</#if>
</#list>




