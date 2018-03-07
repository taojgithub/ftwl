package com.ftwl.ltp.controller;

import com.ftwl.frame.context.GenericException;
import com.ftwl.frame.web.AjaxResult;
import com.ftwl.frame.web.BaseController;
import com.ftwl.frame.web.resolve.BodyParam;
import com.ftwl.ltp.service.UserService;
import com.ftwl.ltp.model.entity.User;
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
@RequestMapping("user")
public class UserController extends BaseController {

    @Autowired
    private UserService userService;

    /**
    * 新增
    * @param entity
    * @return
    */
    @RequestMapping("add")
    public AjaxResult<User> add(@RequestBody User entity) {
        return successResult();
    }

    /**
    * 更新
    * @param entity
    * @return
    */
    @RequestMapping("update")
    public AjaxResult<User> update(@RequestBody User entity) {
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
    public AjaxResult<User> get(String id) {
        if (StringUtils.isBlank(id)) {
            throw new GenericException("ID不可为空");
        }
        User user = userService.get(id);
        return successResult(user);
     }
}
