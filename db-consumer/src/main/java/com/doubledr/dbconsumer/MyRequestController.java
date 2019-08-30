package com.doubledr.dbconsumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.doubledr.pojo.User;
import com.doubledr.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Random;

@RestController
public class MyRequestController {
    @Reference(version = "${spring.application.version}",
            application = "${spring.application.id}",
            registry = "${dubbo.registry.address}")
    UserService userService;

    @RequestMapping("/addUser")
    public User addUser(){
        User newUser = new User();
        newUser.setId(new Random().toString());
        newUser.setUserId(Utils.getRandomString(9));
        newUser.setState(0);
        newUser.setUserName("NewUser"+Utils.getRandomString(1));
        newUser.setUserPwd("123456");
        newUser.setRegisterDate(new Date());

        return userService.AddUser(newUser);
    }
    @RequestMapping("/findUser")
    public User findUserById() {
        User user = userService.queryUserById("");
        return user;
    }
}
