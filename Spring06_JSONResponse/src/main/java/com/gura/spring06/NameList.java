package com.gura.spring06;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="list")
public class NameList {
	private List<String> name;

	public List<String> getName() {
		return name;
	}
	@XmlElement
	public void setName(List<String> name) {
		this.name = name;
	}
	
	
}
