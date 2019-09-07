package com.zxq.dao;

import com.zxq.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserMapper {
    List<User> selectAllUsers();
}
