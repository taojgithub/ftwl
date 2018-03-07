package com.ftwl.ltp.model.field;

import com.ftwl.frame.server.dao.BaseField;

/**
* 菜单表表字段
* @author autoCoder
* @since 2018-03-05 16:24:36
*/
public final class PermissionField extends BaseField {

    private PermissionField() {
        super();
    }

    public static PermissionField update() {
        return new PermissionField();
    }

    public PermissionField pid() {
        this.addField("pid");
        return this;
    }

    public PermissionField menuName() {
        this.addField("menuName");
        return this;
    }

    public PermissionField url() {
        this.addField("url");
        return this;
    }

    public PermissionField updateUser() {
        this.addField("updateUser");
        return this;
    }

    public PermissionField updateTime() {
        this.addField("updateTime");
        return this;
    }

}
