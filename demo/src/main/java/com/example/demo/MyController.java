package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
	
	@GetMapping("/home")
	public String myGetRequest(@RequestParam(name="name",required=false,defaultValue="Default Value") String name,Model model){
		System.out.println("Welcome to home page method ");
		System.out.println("Name paramter  value "+name);
		model.addAttribute("response", name);
		return "myTemplatePage";
		
	}

}
