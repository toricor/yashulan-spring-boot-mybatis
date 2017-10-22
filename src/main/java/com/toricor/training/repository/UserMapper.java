package com.toricor.training.repository;

import com.toricor.training.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("SELECT * FROM user")
    List<User> findAll();

    @Select("SELECT * " +
            "FROM user " +
            "WHERE id = #{id}")
    User findById(int id);

    @Insert("INSERT INTO user(name) VALUES (#{name})")
    @Options(useGeneratedKeys = true)
    void insert(User user);
    
}
