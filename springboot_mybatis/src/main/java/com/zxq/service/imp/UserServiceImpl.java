package com.zxq.service.imp;

import com.zxq.domain.User;
import com.zxq.dao.UserMapper;
import com.zxq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service("UserService")
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> selectAllUsers() {
        return userMapper.selectAllUsers();

    }
}
