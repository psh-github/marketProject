package com.market.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MarketController {
	
	
	@GetMapping("/")
	@ResponseBody
	public String main() {
		return "market Project";
	}

}
