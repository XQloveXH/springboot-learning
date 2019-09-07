package com.zxq.dao;

import com.zxq.domain.Customer;
import java.util.List;

public interface CustomerMapper {
    int deleteByPrimaryKey(Integer custId);

    int insert(Customer record);

    Customer selectByPrimaryKey(Integer custId);

    List<Customer> selectAll();

    int updateByPrimaryKey(Customer record);
}