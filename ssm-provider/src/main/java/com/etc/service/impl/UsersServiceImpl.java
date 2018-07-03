package com.etc.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.etc.entity.Users;
import com.etc.service.UsersService;

public class UsersServiceImpl implements UsersService {

	@Override
	public List<Users> getUsers() {
		List<Users> list = new ArrayList();
		Users u = new Users();
		u.setUserId(1);
		u.setUserLevel(1);
		u.setUserName("Big A");
		u.setUserPwd("A!@#$%");
		u.setUserState(1);

		Users u1 = new Users();
		u1.setUserId(2);
		u1.setUserLevel(0);
		u1.setUserName("Big Z");
		u1.setUserPwd("W@#$$%");
		u1.setUserState(1);
		// TODO Auto-generated method stub

		list.add(u);
		list.add(u1);
		return list;
	}

}
