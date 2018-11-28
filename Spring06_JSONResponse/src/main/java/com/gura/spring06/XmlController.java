package com.gura.spring06;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class XmlController {
	
	@RequestMapping("/xml01")
	public String xml01() {
		return "xml01";
	}
	
}










