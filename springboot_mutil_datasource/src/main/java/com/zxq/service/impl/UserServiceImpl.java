package com.zxq.service.impl;

import com.zxq.dao.cluster.CityMapper;
import com.zxq.dao.master.UserMapper;
import com.zxq.domain.City;
import com.zxq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private CityMapper cityMapper;
    @Override
    public City findCityByName(String cityName) {
//       业务逻辑省略 ----了解多数据源即可
        return null;
    }
}
