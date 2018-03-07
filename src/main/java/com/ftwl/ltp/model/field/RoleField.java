package com.ftwl.ltp.model.field;

import com.ftwl.frame.server.dao.BaseField;

/**
* 角色表表字段
* @author autoCoder
* @since 2018-03-05 16:24:35
*/
public final class RoleField extends BaseField {

    private RoleField() {
        super();
    }

    public static RoleField update() {
        return new RoleField();
    }

    public RoleField roleName() {
        this.addField("roleName");
        return this;
    }

    public RoleField notes() {
        this.addField("notes");
        return this;
    }

    public RoleField updateUser() {
        this.addField("updateUser");
        return this;
    }

    public RoleField updateTime() {
        this.addField("updateTime");
        return this;
    }

}
