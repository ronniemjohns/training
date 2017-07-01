package com.me.jaxb;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

public class XmlToObjectDriver {
	
	public static final String FILE_NAME = "exampleObject.xml";

	public static void main(String[] args) throws JAXBException {
		
		ExampleObject eo = (ExampleObject) JAXBContext
				.newInstance(ExampleObject.class)
				.createUnmarshaller()
				.unmarshal(new File(FILE_NAME));
		
		System.out.println(eo.getSomethingElse());
		
		

	}

}
