package com.gura.spring06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JsonController {
	@RequestMapping("/json05")
	@ResponseBody
	public Map<String,List<String>> json05(){
		List<String> names=new ArrayList<>();
		names.add("김구라");
		names.add("해골");
		names.add("원숭이");
		
		Map<String,List<String>> map=new HashMap<>();
		map.put("names", names);
		return map;
	}

	@RequestMapping("/json04")
	@ResponseBody
	public List<String> json04(){
		List<String> names=new ArrayList<>();
		names.add("김구라");
		names.add("해골");
		names.add("원숭이");
		
		return names;
	}
	
	@RequestMapping("/json03")
	@ResponseBody
	public Map<String, Object> json03(){
		Map<String, Object> map=new HashMap<>();
		map.put("num", 1);
		map.put("name", "gura");
		map.put("isMan", true);
		return map;
	}
	
	@RequestMapping("/json01")
	public String json01() {
		// /WEB-INF/views/json01.jsp 페이지로 forward 이동해서 
		// json 문자열 응답 
		return "json01";
	}
	
	@RequestMapping("/json02")
	@ResponseBody
	public Map<String, Object> json02() {
		Map<String, Object> map=new HashMap<>();
		map.put("num", 999);
		/*	 
		 * 	1. jackson 라이브러리가 dependency 에 명시 되어있고 
		 *  2. 위 메소드에 @ResponseBody 어노테이션이 붙어있고
		 *  3. servlet-context.xml 에 <annotation-driven/> 
		 *  이 설정되어있으면
		 *  
		 *  HashMap 객체에 담긴 정보가 아래의 json 형식의 문자열로 
		 *  클라이언트에게 응답된다. 
		 *
		 */
		return map;
	}
}







