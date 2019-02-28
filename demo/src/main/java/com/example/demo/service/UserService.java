package com.example.demo.service;

import com.example.demo.model.AoaUser;

import java.util.List;
import java.util.Map;

public interface UserService {
    public List<Map<String,Object>> userList(AoaUser aoaUser);
}
