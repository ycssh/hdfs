package com.shouy.admin.base.mybatis.mapper;

import java.util.List;

import com.shouy.admin.base.mybatis.model.UserRole;
import com.shouy.admin.base.mybatis.model.UserRoleKey;

public interface UserRoleMapper {
    int deleteByPrimaryKey(UserRoleKey key);

    int insert(UserRole record);

    int insertSelective(UserRole record);

    UserRole selectByPrimaryKey(UserRoleKey key);

    int updateByPrimaryKeySelective(UserRole record);

    int updateByPrimaryKey(UserRole record);

	void deleteByUser(Long id);

	void insertBatch(List<UserRole> userRoles);

}