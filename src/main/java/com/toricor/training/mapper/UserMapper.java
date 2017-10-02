package com.toricor.training.mapper;

import com.toricor.training.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    @Insert("INSERT INTO user (id, name) VALUES (#{id}, #{name})")
    @Options(useGeneratedKeys = true)
    void insert(User user);

    @Select("SELECT id, name FROM user WHERE id = #{id}")
    User select(int id);

    @Select("SELECT id, name FROM user")
    List<User> selectAll();
}
