package com.shouy.admin.listener;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.shouy.admin.Constants;
import com.shouy.admin.base.mybatis.mapper.SysInitMapper;
import com.shouy.admin.base.mybatis.model.SysInit;
import com.shouy.admin.spring.SpringUtils;

public class SysInitListener implements ServletContextListener {

	private static final Logger log = LoggerFactory
			.getLogger(SysInitListener.class);

	ServletContext ctx;

	public void contextDestroyed(ServletContextEvent event) {
		this.ctx = null;
	}

	public void contextInitialized(ServletContextEvent event) {
		log.info("读取系统初始化数据开始");
		SysInitMapper sysInitMapper = SpringUtils.getBean("sysInitMapper");
		List<SysInit> list = sysInitMapper.selectAll();
		Map<String, String> inits = new HashMap<String, String>();
		for (SysInit init : list) {
			inits.put(init.getType(), init.getValue());
		}
		Constants.cache.put("sys_init", inits);
		Constants.cache.put("sys_initlist", list);
		log.info("读取系统初始化数据结束");
	}
}