package com.ftwl.ltp.model.req;


import com.ftwl.ltp.model.entity.Order;
import org.hibernate.validator.constraints.NotEmpty;


/**
* 培训测试表
* @author autoCoder
* @since 2018-03-04 16:53:36
*/
public class OrderSaveReq {

    @NotEmpty(message = "姓名不能为空")
    private String name; //
    @NotEmpty(message = "编码不能为空")
    private String code; //

    public Order getEntity() {
        Order entity = new Order();
        entity.setCode(this.code);
        entity.setName(this.name);
        return entity;
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
