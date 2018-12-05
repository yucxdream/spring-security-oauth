package com.visionet.controller;

import com.visionet.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ Author     ：yucx
 * @ Date       ：Created in 上午10:08 2018/12/4
 * @ Version    ：1.0
 */
@Controller
@RequestMapping("/testdizhi")
@Api(description = "测试地址")
public class TestController {


    @RequestMapping(value = "/test",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "测试1",notes = "测试2")
    public User testUrl(@RequestBody User user){

        System.out.println(Thread.currentThread().getName());

        System.out.println(user.getId());

        System.out.println("aaaaaaa");

        return user;

    }
}
