package com.shouy.admin.base.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shouy.admin.base.mybatis.mapper.SysInitMapper;
import com.shouy.admin.base.mybatis.model.SysInit;
import com.shouy.admin.base.service.SysInitService;

@Service
public class SysInitServiceImpl implements SysInitService {

    @Autowired
    private SysInitMapper sysInitMapper;
	
	public void update(int id, String value) {
		SysInit init = new SysInit();
		init.setId(id);
		init.setValue(value);
		sysInitMapper.updateByPrimaryKeySelective(init);
	}

}
