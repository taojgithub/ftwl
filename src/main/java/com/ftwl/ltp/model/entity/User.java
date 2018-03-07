package com.ftwl.ltp.model.entity;

import com.ftwl.frame.server.dao.BaseEntity;
import com.ftwl.frame.server.dao.Recordable;
import java.util.Date;

/**
* 用户表
* @author autoCoder
* @since 2018-03-05 16:24:35
*/
public class User implements Recordable, BaseEntity {

    private String id; //ID
    private String userName; //
    private String password; //
    private String nickName; //昵称
    private Integer age; //年龄
    private String sex; //性别 0/男 1/女
    private String phone; //手机号码
    private String email; //邮件
    private String createUser; //创建人
    private Date createTime; //创建时间
    private String updateUser; //修改人/操作人
    private Date updateTime; //修改时间

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }
    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

}
