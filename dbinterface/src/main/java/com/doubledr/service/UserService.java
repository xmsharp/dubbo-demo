package com.doubledr.service;

import com.doubledr.pojo.User;

/**
 * 数据库操作User的对象接口
 */
public interface UserService {
    User queryUserById(String userId);
    User queryUserByName(String userName);
    User AddUser(User newUser);
}
