package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.LoginRepository;
import com.example.demo.model.LoginModel;

@Service
public class LoginService {
	@Autowired
	LoginRepository ur;
	public String loginCheckData(String username,String password)
	{

		LoginModel user = ur.findByusername(username);
		if(user == null)
		{
			return "No User Found/nPlease Try Again!!!!";
		}
		else
		{
			if(user.getPassword().equals(password))
			{
				return "Login Successful";
			}
			else
			{
				return "Login Failed";
			}
		}
		
	}

}