package cz.jitipinkas.jba.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/home")
	public String index(){
		return "home";
	}
}
