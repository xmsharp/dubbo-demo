package com.doubledr.dbserviceprovider.serviceimpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.doubledr.dbserviceprovider.repository.UserRepository;
import com.doubledr.pojo.User;
import com.doubledr.service.UserService;

/**
 * 数据持久层服务实现
 */
@Service(version = "${spring.application.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}")
public class UserServiceImpl implements UserService {
    UserRepository userRepository;
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    @Override
    public User queryUserById(String userId) {
        return userRepository.findUserById(userId);
    }

    @Override
    public User queryUserByName(String userName) {
        return userRepository.findUserByName(userName);
    }

    @Override
    public User AddUser(User newUser) {
        return userRepository.save(newUser);
    }
}
