package com.yun.controller;

import com.yun.service.RegAndLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    //@Autowired是依赖注入，注入service层
    @Autowired
    private RegAndLoginService regAndLoginService;

    //注册账号
    @RequestMapping("/reg")
    public String reg(){return "reg";}

}
