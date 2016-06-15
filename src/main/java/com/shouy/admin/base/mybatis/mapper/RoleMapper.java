package com.shouy.admin.base.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import com.github.pagehelper.Page;

import com.shouy.admin.base.mybatis.model.Role;

public interface RoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);

	List<Role> selectByUser(Long userId);

	Page<Role> selectByPage(Role role, RowBounds rowBounds);

	List<Role> findAll();
}