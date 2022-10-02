package com.ab.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ab.Services.PingPongServiceImpl;

@Controller
public class PingPongController {

	@Autowired
	private PingPongServiceImpl serviceImpl;

	@GetMapping("/")
	public String startApplication() {

		// redirect to "/ping" end-point when local host is ran
		return "redirect:/ping";
	}
	
	
	@GetMapping("/ping")
	public String getPongValue(Model model) {

		String pong = serviceImpl.createPongValue();

		model.addAttribute("pong", pong);

		return "pong_page";
	}

} // end of class
