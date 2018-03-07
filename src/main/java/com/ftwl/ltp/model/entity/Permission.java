package com.ftwl.ltp.model.entity;

import com.ftwl.frame.server.dao.BaseEntity;
import com.ftwl.frame.server.dao.Recordable;
import java.util.Date;

/**
* 菜单表
* @author autoCoder
* @since 2018-03-05 16:24:36
*/
public class Permission implements Recordable, BaseEntity {

    private String id; //ID
    private String pid; //父ID
    private String menuName; //菜单名称
    private String url; //链接
    private String createUser; //创建人
    private Date createTime; //
    private String updateUser; //修改人/操作人
    private Date updateTime; //修改时间

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }
    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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
