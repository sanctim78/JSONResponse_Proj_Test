package com.gura.spring06;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="friend")
public class Friend {
	private int num;
	private String name;
	private boolean isMan;
	public int getNum() {
		return num;
	}
	@XmlElement
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	@XmlElement
	public void setName(String name) {
		this.name = name;
	}
	public boolean isMan() {
		return isMan;
	}
	@XmlElement
	public void setMan(boolean isMan) {
		this.isMan = isMan;
	}
	
	
}
