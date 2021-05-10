package com.xworkz.vaccination;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
@Component
@RequestMapping("/")
public class RegisterComponent {
	public RegisterComponent() {
		System.out.println("invoked"+this.getClass().getSimpleName());
	}
	@RequestMapping("/Register.do")
	public String onRegister(@RequestParam String name,@RequestParam String age,@RequestParam String Location,Model model){
	
		System.out.println("invoked register");
		System.out.println(name);
		System.out.println(age);
		System.out.println(Location);
		model.addAttribute("message","registration success for "+name);
		
		
		return "Vaccination";
	}
	@RequestMapping("/feedback.do")
	public String onFeedbackClick()
	{
		System.out.println("invoked onFeedback click");
		return "feedback";
		
		}
	}

