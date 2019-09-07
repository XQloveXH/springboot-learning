package com.zxq.service;

import com.zxq.domain.City;

public interface UserService {
    City findCityByName(String cityName);
}
