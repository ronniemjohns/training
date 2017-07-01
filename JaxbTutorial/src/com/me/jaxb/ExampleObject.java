package com.me.jaxb;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="ExampleObject")
public class ExampleObject {
	
	private String name;
	private String somethingElse;
	
	public ExampleObject() {
		
	}
	
	public ExampleObject(String name, String somethingElse) {
		this.name = name;
		this.somethingElse = somethingElse;
	}

	@XmlElement(name="name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@XmlElement(name="somethingElse")
	public String getSomethingElse() {
		return somethingElse;
	}

	public void setSomethingElse(String somethingElse) {
		this.somethingElse = somethingElse;
	}

}
