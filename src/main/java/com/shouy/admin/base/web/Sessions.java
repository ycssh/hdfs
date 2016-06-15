package com.shouy.admin.base.web;

import org.apache.shiro.SecurityUtils;

import com.shouy.admin.Constants;
import com.shouy.admin.base.mybatis.model.User;

public class Sessions {
	public User getUser() {
		return (User) SecurityUtils.getSubject().getSession().getAttribute(Constants.CURRENT_USER);
	}
	public String getIP(){
		return SecurityUtils.getSubject().getSession().getHost();
	}
}
