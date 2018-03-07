package com.ftwl.ltp.model.entity;

import com.ftwl.frame.server.dao.BaseEntity;
import com.ftwl.frame.server.dao.Recordable;
import java.util.Date;

/**
* 角色菜单表
* @author autoCoder
* @since 2018-03-05 16:23:57
*/
public class RolePermission implements Recordable, BaseEntity {

    private String id; //
    private String createUser; //创建人
    private Date cretaeTime; //创建时间
    private String updateUser; //修改人/操作人
    private Date updateTime; //修改时间
    private String roleId; //
    private String permissionId; //

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    @Override
    public Date getCreateTime() {
        return null;
    }

    @Override
    public void setCreateTime(Date date) {

    }

    public Date getCretaeTime() {
        return cretaeTime;
    }

    public void setCretaeTime(Date cretaeTime) {
        this.cretaeTime = cretaeTime;
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
    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }
    public String getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(String permissionId) {
        this.permissionId = permissionId;
    }

}
