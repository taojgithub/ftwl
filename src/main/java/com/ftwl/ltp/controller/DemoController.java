package com.ftwl.ltp.controller;

import com.ftwl.core.service.SerialNumberServiceUtil;
import com.ftwl.frame.context.GenericException;
import com.ftwl.frame.web.AjaxResult;
import com.ftwl.frame.web.BaseController;
import com.ftwl.frame.web.resolve.BodyParam;
import com.ftwl.ltp.model.entity.Demo;
import com.ftwl.ltp.model.enums.LtpSerialNumberPrefixEnum;
import com.ftwl.ltp.model.field.DemoField;
import com.ftwl.ltp.service.DemoService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author autoCoder
 * @since 2018-03-04 11:48:42
 */
@Controller
@RestController
@RequestMapping("demo")
public class DemoController extends BaseController {

    @Autowired
    private DemoService demoService;

    /**
     * 新增
     *
     * @param entity
     * @return
     */
    @RequestMapping("add")
    public AjaxResult<Demo> add(@RequestBody Demo entity) {
        System.out.println("Hello World!");
        entity.setCode(SerialNumberServiceUtil.getSerialNumber(LtpSerialNumberPrefixEnum.DEMO));
        demoService.insert(entity);
        return successResult(entity);
    }

    /**
     * 更新
     *
     * @param entity
     * @return
     */
    @RequestMapping("update")
    public AjaxResult<Demo> update(@RequestBody Demo entity) {
        demoService.updateField(entity, DemoField.update().name());
        return successResult(entity);
    }

    /**
     * 删除
     *
     * @param id
     * @return
     */
    @RequestMapping("delete")
    @BodyParam
    public AjaxResult delete(String id) {
        return successResult();
    }


    /**
     * 获取单个信息
     *
     * @param id
     * @return
     */
    @RequestMapping("get")
    @BodyParam
    public AjaxResult<Demo> get(String id) {
        if (StringUtils.isBlank(id)) {
            throw new GenericException("ID不可为空");
        }
        Demo demo = demoService.get(id);
        return successResult(demo);
    }
}
