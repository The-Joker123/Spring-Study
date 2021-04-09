package com.zeng.mapper;

import com.zeng.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserMapperIml implements UserMapper {
//我们所有的操作都是使用SqlSession以前，现在用xxxxTemplate
    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<User> selectuser() {
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        return mapper.selectuser();
    }




}
