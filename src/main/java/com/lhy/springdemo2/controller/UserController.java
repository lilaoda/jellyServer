package com.lhy.springdemo2.controller;

import com.lhy.springdemo2.entiy.User;
import com.lhy.springdemo2.jpa.UserJpa;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
@Api(value = "用户相关API")
public class UserController {

    @Autowired
    UserJpa userJpa;

    @ApiOperation(value = "登陆接口")
//    @ApiImplicitParams({@ApiImplicitParam(paramType = "String"),@ApiImplicitParam()})
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
        return "Hello world";
    }

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public List<User> findAll() {
//        userJpa.save()
//        userJpa.delete();
//        userJpa.saveAndFlush()
        return userJpa.findAll();
    }
}
