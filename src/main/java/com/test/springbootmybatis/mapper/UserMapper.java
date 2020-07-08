package com.test.springbootmybatis.mapper;

import com.test.springbootmybatis.pojo.User;

import java.util.List;

public interface UserMapper {


    int addUser(User user);

    List<User> findUserAll();

    User findUser(String userId);

    int updateUser(User user);

    int deleteUser(String userId);
}