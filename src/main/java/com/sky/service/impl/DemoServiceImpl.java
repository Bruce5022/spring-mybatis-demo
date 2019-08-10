package com.sky.service.impl;

import com.sky.mapper.UserMapper;
import com.sky.model.User;
import com.sky.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUserList() {
        return userMapper.searchUsers();
    }
}
