package com.ftwl.ltp.model.field;

import com.ftwl.frame.server.dao.BaseField;

/**
* 用户表表字段
* @author autoCoder
* @since 2018-03-05 16:24:35
*/
public final class UserField extends BaseField {

    private UserField() {
        super();
    }

    public static UserField update() {
        return new UserField();
    }

    public UserField userName() {
        this.addField("userName");
        return this;
    }

    public UserField password() {
        this.addField("password");
        return this;
    }

    public UserField nickName() {
        this.addField("nickName");
        return this;
    }

    public UserField age() {
        this.addField("age");
        return this;
    }

    public UserField sex() {
        this.addField("sex");
        return this;
    }

    public UserField phone() {
        this.addField("phone");
        return this;
    }

    public UserField email() {
        this.addField("email");
        return this;
    }

    public UserField updateUser() {
        this.addField("updateUser");
        return this;
    }

    public UserField updateTime() {
        this.addField("updateTime");
        return this;
    }

}
