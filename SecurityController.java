package com.nucleus.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecurityController {

	@RequestMapping("/loginform")
	public String request1()
	{
		return "LoginForm";
	}
	
	@RequestMapping("/loginfailure")
	public String request2(ModelMap map)
	{
		map.addAttribute("error","Invalid credentials");
		return "LoginForm";
	}
	
	@RequestMapping("/defaultpage")
	public String request3(HttpServletRequest request)
	{		
		String target="result";
		if(request.isUserInRole("ROLE_ADMIN"))
			target="adminHome";
		else if(request.isUserInRole("ROLE_USER"))
			target="makerHome";
		return target;
	}
}
