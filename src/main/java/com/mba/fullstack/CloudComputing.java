package com.mba.fullstack;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
public class CloudComputing {
	
	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "Hello Word";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
