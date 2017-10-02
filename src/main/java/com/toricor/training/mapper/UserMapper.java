package com.toricor.training.mapper;

import com.toricor.training.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

@Mapper
public interface UserMapper {

    @Insert("INSERT INTO user (id, name) VALUES (#{id}, #{name})")
    @Options(useGeneratedKeys = true)
    void insert(User user);

    User select(int id);

}
