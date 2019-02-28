package com.example.demo.dao;


import com.example.demo.model.AoaRole;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AoaRoleMapper {
    int deleteByPrimaryKey(Long roleId);

    int insert(AoaRole record);

    int insertSelective(AoaRole record);

    AoaRole selectByPrimaryKey(Long roleId);

    int updateByPrimaryKeySelective(AoaRole record);

    int updateByPrimaryKey(AoaRole record);
}