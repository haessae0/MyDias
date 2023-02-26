package com.mydias.mydias.repository;

import com.mydias.mydias.vo.UserVO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao{
    @Autowired
    private SqlSession sql;

    @Override
    public void register(UserVO user){
        sql.insert("UserSql.register", user);
    }

    @Override
    public UserVO login(UserVO user){
        return sql.selectOne("UserSql.login", user);
    }

    @Override
    public UserVO selectUser(String email) {
        return sql.selectOne("UserSql.selectUser", email);
    }

    @Override
    public int emailChk(UserVO user){
        int result = sql.selectOne("UserSql.emailChk", user);
        return result;
    }
}
