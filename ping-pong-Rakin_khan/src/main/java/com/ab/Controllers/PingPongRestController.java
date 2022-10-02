package com.ab.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.ab.Services.PingPongServiceImpl;

@RestController
public class PingPongRestController {

	@Autowired
	private PingPongServiceImpl serviceImpl;

	public String getPongValue() {

		String pong = serviceImpl.createPongValue();

		return pong;
	}

}
