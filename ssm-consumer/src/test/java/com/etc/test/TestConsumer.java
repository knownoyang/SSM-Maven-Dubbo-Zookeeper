package com.etc.test;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.etc.service.UsersService;

public class TestConsumer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "applicationContext.xml" });
		context.start();

		System.out.println("Ïû·ÑÕß");
		UsersService us = (UsersService) context.getBean("us");

		System.out.println(us.getUsers());

		System.in.read(); //

	}

}
