package com.example.demo.service.impl;

import com.example.demo.dao.AoaUserMapper;
import com.example.demo.model.AoaUser;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private AoaUserMapper aoaUserMapper;
    @Override
    public List<Map<String, Object>> userList(AoaUser aoaUser) {
        return aoaUserMapper.userList(aoaUser);
    }
}
