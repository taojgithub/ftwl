package com.ftwl.ltp.model.field;

import com.ftwl.frame.server.dao.BaseField;

/**
* 角色菜单表表字段
* @author autoCoder
* @since 2018-03-05 16:23:57
*/
public final class RolePermissionField extends BaseField {

    private RolePermissionField() {
        super();
    }

    public static RolePermissionField update() {
        return new RolePermissionField();
    }

    public RolePermissionField cretaeTime() {
        this.addField("cretaeTime");
        return this;
    }

    public RolePermissionField updateUser() {
        this.addField("updateUser");
        return this;
    }

    public RolePermissionField updateTime() {
        this.addField("updateTime");
        return this;
    }

    public RolePermissionField roleId() {
        this.addField("roleId");
        return this;
    }

    public RolePermissionField permissionId() {
        this.addField("permissionId");
        return this;
    }

}
