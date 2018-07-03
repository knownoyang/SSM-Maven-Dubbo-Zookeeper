package com.etc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.etc.entity.Users;
import com.etc.service.UsersService;


@Controller
public class UsersController {

	@Autowired
	private UsersService usersService;

	@RequestMapping(value = "list", method = RequestMethod.GET)
	public String listUsers(Model model) {
		List<Users> list=usersService.getUsers();
		model.addAttribute("list", list);
		return "list";
	}
}
