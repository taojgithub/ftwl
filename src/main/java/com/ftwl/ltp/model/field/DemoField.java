package com.ftwl.ltp.model.field;

import com.ftwl.frame.server.dao.BaseField;

/**
* 表未注释表字段
* @author autoCoder
* @since 2018-03-04 13:57:12
*/
public final class DemoField extends BaseField {

    private DemoField() {
        super();
    }

    public static DemoField update() {
        return new DemoField();
    }

    public DemoField name() {
        this.addField("name");
        return this;
    }

    public DemoField code() {
        this.addField("code");
        return this;
    }

}
