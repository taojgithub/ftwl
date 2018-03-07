package com.ftwl.ltp.controller;

import com.ftwl.frame.web.AjaxResult;
import com.ftwl.frame.web.BaseController;
import com.ftwl.ltp.model.entity.User;
import com.ftwl.ltp.model.req.UserLoginReq;
import com.ftwl.ltp.service.LoginService;
import com.ftwl.ltp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tao on 2018/3/5.
 */
@Controller
@RestController
public class LoginController extends BaseController {

    @Autowired
    private LoginService loginService;

    @Autowired
    private UserService userService;

    @RequestMapping("login")
    public AjaxResult login(@RequestBody UserLoginReq req) {
        User entity = req.getEntity();
        entity = userService.getUserByUserName(entity);
        if (!entity.getPassword().equals(req.getPassword().trim())) {
            AjaxResult ajaxResult = new AjaxResult();
            ajaxResult.setMsg("账号或密码错误");
            ajaxResult.setSuccess(false);
            return ajaxResult;
        }
        return successResult(entity);
    }
}
