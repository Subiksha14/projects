package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class instagram {
	@ResponseBody
	@RequestMapping(value="/signin",method=RequestMethod.GET)
	public String signin()
	{
		return "I am in signin page";
	}
	@ResponseBody
	@RequestMapping(value="/signup",method=RequestMethod.GET)
	public String signup()
	{
		return "I am in signup page";
	}

}
