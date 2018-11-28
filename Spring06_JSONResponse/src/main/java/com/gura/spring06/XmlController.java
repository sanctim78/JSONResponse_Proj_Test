package com.gura.spring06;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class XmlController {
	
	@RequestMapping("/xml01")
	public String xml01() {
		return "xml01";
	}
	
	@RequestMapping("/xml02")
	@ResponseBody
	public Data xml02() {
		
		Data d=new Data();
		d.setNum(999);
		
		return d;
	}
	
	@RequestMapping("/xml03")
	@ResponseBody
	public Friend xml03() {
		
		Friend f=new Friend();
		f.setNum(1);
		f.setName("김구라");
		f.setMan(true);
		
		return f;
	}
	@RequestMapping("/xml04")
	@ResponseBody
	public NameList xml04() {
		
		List<String> list=new ArrayList<>();
		list.add("김구라");
		list.add("해골");
		list.add("원숭이");
		
		NameList l=new NameList();
		l.setName(list);
		
		return l;
	}
	
}

















