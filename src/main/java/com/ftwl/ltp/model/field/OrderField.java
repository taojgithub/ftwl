package com.ftwl.ltp.model.field;

import com.ftwl.frame.server.dao.BaseField;

/**
* 培训测试表表字段
* @author autoCoder
* @since 2018-03-04 16:53:36
*/
public final class OrderField extends BaseField {

    private OrderField() {
        super();
    }

    public static OrderField update() {
        return new OrderField();
    }

    public OrderField orderSn() {
        this.addField("orderSn");
        return this;
    }

    public OrderField name() {
        this.addField("name");
        return this;
    }

    public OrderField code() {
        this.addField("code");
        return this;
    }

    public OrderField updateUser() {
        this.addField("updateUser");
        return this;
    }

    public OrderField updateTime() {
        this.addField("updateTime");
        return this;
    }

}
