package com.nucleus.utility;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class PasswordEncode {
	public static String encodePwd(String password)
	{
		BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
		return encoder.encode(password);
		
	}
	
	/*public static void main(String[] args) {
		System.out.println(encodePwd("admin1234"));
		
	}
*/}


