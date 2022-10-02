package com.ab.Services;

import org.springframework.stereotype.Service;

@Service
public class PingPongServiceImpl implements PingPongService {

	@Override
	public String createPongValue() {
		
		String pong = "pong";

		return pong;
	}

}
