package com.ftwl.ltp.model.entity;

import com.ftwl.frame.server.dao.BaseEntity;
import com.ftwl.frame.server.dao.Recordable;
import java.util.Date;

/**
* 角色表
* @author autoCoder
* @since 2018-03-05 16:24:35
*/
public class Role implements Recordable, BaseEntity {

    private String id; //ID
    private String roleName; //角色名称
    private String notes; //备注
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
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
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
