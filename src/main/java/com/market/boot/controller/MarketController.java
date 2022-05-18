package com.market.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MarketController {
	
	@GetMapping("/guest/guest_index")
	public String boardWriteForm(Model model) {
		
		System.out.println("board");
		return "guest/guest_index";
	}

}