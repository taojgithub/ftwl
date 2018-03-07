package com.ftwl.ltp.model.field;

import com.ftwl.frame.server.dao.BaseField;

/**
* 用户角色关联表表字段
* @author autoCoder
* @since 2018-03-05 16:24:36
*/
public final class UserRoleField extends BaseField {

    private UserRoleField() {
        super();
    }

    public static UserRoleField update() {
        return new UserRoleField();
    }

    public UserRoleField userId() {
        this.addField("userId");
        return this;
    }

    public UserRoleField roleId() {
        this.addField("roleId");
        return this;
    }

    public UserRoleField updateUser() {
        this.addField("updateUser");
        return this;
    }

    public UserRoleField updateTime() {
        this.addField("updateTime");
        return this;
    }

}
