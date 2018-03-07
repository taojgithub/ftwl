package com.ftwl.ltp.model.entity;

import com.ftwl.frame.server.dao.BaseEntity;



/**
* 表未注释
* @author autoCoder
* @since 2018-03-04 13:57:12
*/
public class Demo implements BaseEntity {

    private String id; //
    private String name; //
    private String code; //

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}
