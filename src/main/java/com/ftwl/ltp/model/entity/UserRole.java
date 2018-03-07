package com.ftwl.ltp.model.entity;

import com.ftwl.frame.server.dao.BaseEntity;
import com.ftwl.frame.server.dao.Recordable;
import java.util.Date;

/**
* 用户角色关联表
* @author autoCoder
* @since 2018-03-05 16:24:36
*/
public class UserRole implements Recordable, BaseEntity {

    private String id; //ID
    private String userId; //用户自增ID
    private String roleId; //角色自增ID
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
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
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
