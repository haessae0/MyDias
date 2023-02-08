package com.mydias.mydias.repository;

import com.mydias.mydias.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {
    List<User> selectList();
}
