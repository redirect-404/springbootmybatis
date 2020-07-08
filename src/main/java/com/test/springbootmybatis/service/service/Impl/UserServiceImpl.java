package com.test.springbootmybatis.service.service.Impl;

import com.test.springbootmybatis.mapper.UserMapper;
import com.test.springbootmybatis.pojo.User;
import com.test.springbootmybatis.service.UserService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Transactional
    public int userAdd(User user) {
        return userMapper.addUser(user);
    }

    public List<User> findUserAll() {
        List<User> list = userMapper.findUserAll();
        return list;
    }

    @Override
    public User findUser(String userId) {
        return userMapper.findUser(userId);
    }

    @Override
    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }

    @Override
    public int deleteUser(String userId) {
        return userMapper.deleteUser(userId);
    }
}
