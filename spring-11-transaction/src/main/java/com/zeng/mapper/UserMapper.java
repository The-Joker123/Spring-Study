package com.zeng.mapper;

import com.zeng.pojo.User;

import java.util.List;

public interface UserMapper {
    public List<User> selectuser();

    public int addUser(User user);

    public int deleteUser(int id);
}
