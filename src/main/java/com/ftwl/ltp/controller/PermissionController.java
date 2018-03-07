package com.ftwl.ltp.controller;

import com.ftwl.frame.context.GenericException;
import com.ftwl.frame.web.AjaxResult;
import com.ftwl.frame.web.BaseController;
import com.ftwl.frame.web.resolve.BodyParam;
import com.ftwl.ltp.service.PermissionService;
import com.ftwl.ltp.model.entity.Permission;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
* @author autoCoder
* @since 2018-03-05 16:24:36
*/
@Controller
@RestController
@RequestMapping("permission")
public class PermissionController extends BaseController {

    @Autowired
    private PermissionService permissionService;

    /**
    * 新增
    * @param entity
    * @return
    */
    @RequestMapping("add")
    public AjaxResult<Permission> add(@RequestBody Permission entity) {
        return successResult();
    }

    /**
    * 更新
    * @param entity
    * @return
    */
    @RequestMapping("update")
    public AjaxResult<Permission> update(@RequestBody Permission entity) {
        return successResult(entity);
    }

    /**
    * 删除
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
    * @param id
    * @return
    */
    @RequestMapping("get")
    @BodyParam
    public AjaxResult<Permission> get(String id) {
        if (StringUtils.isBlank(id)) {
            throw new GenericException("ID不可为空");
        }
        Permission permission = permissionService.get(id);
        return successResult(permission);
     }
}
