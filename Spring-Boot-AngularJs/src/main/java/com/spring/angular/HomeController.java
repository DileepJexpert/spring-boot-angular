package com.spring.angular;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home(){
		// added by repository direct to test
		return "index";
		
	}
}
