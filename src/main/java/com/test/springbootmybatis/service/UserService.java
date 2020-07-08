package com.test.springbootmybatis.service;

import com.test.springbootmybatis.pojo.User;

import java.util.List;

public interface UserService {

    public int userAdd(User user);

    public List<User> findUserAll();

    public User findUser(String userId);

    public int updateUser(User user);

    public int deleteUser(String userId);

}
