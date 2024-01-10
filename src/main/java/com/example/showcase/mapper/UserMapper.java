package com.example.showcase.mapper;

import com.example.showcase.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from SocialUsers")
    public List<User> findAll();
}
