package com.ftwl.ltp.service;

import com.ftwl.frame.web.AjaxResult;
import com.ftwl.ltp.model.entity.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by tao on 2018/3/5.
 */
@Service
@Transactional
public class LoginService {

    public AjaxResult login(User entity) {
        return null;
    }
}
