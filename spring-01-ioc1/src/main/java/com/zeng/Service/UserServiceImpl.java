package com.zeng.Service;

import com.zeng.dao.UserDao;
import com.zeng.dao.UserDaoImpl;
import com.zeng.dao.UserDaoMySqlImpl;

public class UserServiceImpl implements UserService{

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUsers() {
        userDao.getUser();
    }
}
