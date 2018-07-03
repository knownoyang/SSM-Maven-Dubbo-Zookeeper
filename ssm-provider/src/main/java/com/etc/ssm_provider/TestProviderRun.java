package com.etc.ssm_provider;

import java.io.IOException;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.etc.entity.Users;
import com.etc.service.UsersService;

public class TestProviderRun {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "provider.xml" });
		context.start();
		System.out.println("启动服务");
		// 获取远程服务代理
		UsersService usersSerivce = (UsersService) context.getBean("usersService");
		// 执行远程方法
		List<Users> list = usersSerivce.getUsers();
		list.forEach(System.out::println);
		try {
			System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
