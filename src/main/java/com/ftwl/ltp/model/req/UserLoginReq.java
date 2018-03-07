package com.ftwl.ltp.model.req;

import com.ftwl.ltp.model.entity.User;
import org.hibernate.validator.constraints.NotEmpty;
import org.w3c.dom.Entity;

/**
 * 登入接收类
 * Created by tao on 2018/3/5.
 */
public class UserLoginReq {

    @NotEmpty(message = "账号不能为空")
    private String userName;
    @NotEmpty(message = "密码不能为空")
    private String password;

    public User getEntity() {
        User entity = new User();
        entity.setUserName(this.userName);
        entity.setPassword(this.password);
        return entity;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
