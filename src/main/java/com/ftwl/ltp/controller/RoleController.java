package com.ftwl.ltp.controller;

import com.ftwl.frame.context.GenericException;
import com.ftwl.frame.web.AjaxResult;
import com.ftwl.frame.web.BaseController;
import com.ftwl.frame.web.resolve.BodyParam;
import com.ftwl.ltp.service.RoleService;
import com.ftwl.ltp.model.entity.Role;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
* @author autoCoder
* @since 2018-03-05 16:24:35
*/
@Controller
@RestController
@RequestMapping("role")
public class RoleController extends BaseController {

    @Autowired
    private RoleService roleService;

    /**
    * 新增
    * @param entity
    * @return
    */
    @RequestMapping("add")
    public AjaxResult<Role> add(@RequestBody Role entity) {
        return successResult();
    }

    /**
    * 更新
    * @param entity
    * @return
    */
    @RequestMapping("update")
    public AjaxResult<Role> update(@RequestBody Role entity) {
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
    public AjaxResult<Role> get(String id) {
        if (StringUtils.isBlank(id)) {
            throw new GenericException("ID不可为空");
        }
        Role role = roleService.get(id);
        return successResult(role);
     }
}
