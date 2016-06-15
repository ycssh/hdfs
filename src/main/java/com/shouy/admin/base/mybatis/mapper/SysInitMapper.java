package com.shouy.admin.base.mybatis.mapper;

import java.util.List;

import com.shouy.admin.base.mybatis.model.SysInit;

public interface SysInitMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysInit record);

    int insertSelective(SysInit record);

    SysInit selectByPrimaryKey(Integer id);
    
    List<SysInit> selectAll();

    int updateByPrimaryKeySelective(SysInit record);

    int updateByPrimaryKey(SysInit record);
}