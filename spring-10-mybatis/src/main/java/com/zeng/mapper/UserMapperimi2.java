package com.zeng.mapper;

import com.zeng.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperimi2  extends SqlSessionDaoSupport implements UserMapper {
    public List<User> selectuser() {
       return getSqlSession().getMapper(UserMapper.class).selectuser();
    }
}
