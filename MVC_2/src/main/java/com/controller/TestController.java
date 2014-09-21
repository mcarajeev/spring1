package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/test")
public class TestController {

	@RequestMapping(method = RequestMethod.GET)
	public String dispaly(ModelMap map) {
		System.out.println("in display");
		return "display";
	}
}
