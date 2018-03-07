package com.ftwl.ltp.controller;

import com.ftwl.frame.context.GenericException;
import com.ftwl.frame.web.AjaxResult;
import com.ftwl.frame.web.BaseController;
import com.ftwl.frame.web.resolve.BodyParam;
import com.ftwl.ltp.service.RolePermissionService;
import com.ftwl.ltp.model.entity.RolePermission;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
* @author autoCoder
* @since 2018-03-05 16:23:57
*/
@Controller
@RestController
@RequestMapping("rolePermission")
public class RolePermissionController extends BaseController {

    @Autowired
    private RolePermissionService rolePermissionService;

    /**
    * 新增
    * @param entity
    * @return
    */
    @RequestMapping("add")
    public AjaxResult<RolePermission> add(@RequestBody RolePermission entity) {
        return successResult();
    }

    /**
    * 更新
    * @param entity
    * @return
    */
    @RequestMapping("update")
    public AjaxResult<RolePermission> update(@RequestBody RolePermission entity) {
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
    public AjaxResult<RolePermission> get(String id) {
        if (StringUtils.isBlank(id)) {
            throw new GenericException("ID不可为空");
        }
        RolePermission rolePermission = rolePermissionService.get(id);
        return successResult(rolePermission);
     }
}
