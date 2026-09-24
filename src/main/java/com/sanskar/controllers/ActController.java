package com.sanskar.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sanskar.dtos.UserDTO;

@Controller
public class ActController {
	
	@GetMapping("/act")
	public ModelAndView action() {
		ModelAndView mav = new ModelAndView();
		
		UserDTO u1 = new UserDTO("Rahul", 34, "IIITDM", 89.65f);
		UserDTO u2 = new UserDTO("Sahil", 21, "GGIT", 56.65f);
		UserDTO u3 = new UserDTO("Saroj", 56, "SRIT", 98.34f);
		UserDTO u4 = new UserDTO("Rani", 23, "Global", 70f);
		
		List<UserDTO> users = Arrays.asList(u1,u2,u3,u4);
		
		// to save an object for forward accessing  like saving attribute in session.
		mav.addObject("users",users);
		
		// the name of file which will be displayed.
		mav.setViewName("next.html");
//		mav.setViewName("next");
				
		return mav;
	}
	
}
