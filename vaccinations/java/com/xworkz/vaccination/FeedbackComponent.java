package com.xworkz.vaccination;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.vaccination.dto.FeedbackDTO;

@Component
@RequestMapping("/")
public class FeedbackComponent {
	public FeedbackComponent() {
		System.out.println("invoked"+this.getClass().getSimpleName());
	}
	@RequestMapping("/"
			+ "send.do")
	public String onSend(FeedbackDTO dto,Model model) {
		System.out.println("invoked onSend"+dto);
		model.addAttribute("Feedback success message","registration is success for" +dto.getName());
		return "feedback";
		
	}

}
