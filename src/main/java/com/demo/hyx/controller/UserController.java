package com.demo.hyx.controller;

import com.demo.hyx.pojo.User;
import com.demo.hyx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * ClassName: UserController
 * Package: com.demo.hyx.controller
 * Description:
 *
 * @Author: hyx
 * @Create: 2023/3/4 12:53
 * @Version: v1.0
 */
@Controller
public class UserController {

    //自动注入
    @Autowired
    private UserService userService;

    //发送POST请求
    @PostMapping("/signUp")
    public String saveUser(User user) {
        //将数据保存到数据库
        userService.save(user);
        //请求跳转
        return "success";
    }






}
