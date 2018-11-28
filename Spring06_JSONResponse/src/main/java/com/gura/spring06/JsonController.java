package com.gura.spring06;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JsonController {
	
	@RequestMapping("/json01")
	public String json01() {
		
		return "json01";
	}
}







