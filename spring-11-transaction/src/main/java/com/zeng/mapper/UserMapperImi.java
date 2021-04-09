package com.zeng.mapper;

import com.zeng.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserMapperImi implements UserMapper {
    //我们所有的操作都是使用SqlSession以前，现在用xxxxTemplate
    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<User> selectuser() {
        User user=new User(4,"小亮","1314");
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);

        mapper.addUser(user);
        mapper.deleteUser(3);
        return mapper.selectuser();
    }

    public int addUser(User user) {
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        return mapper.addUser(user);
    }

    public int deleteUser(int id) {
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        return mapper.deleteUser(id);
    }


}
