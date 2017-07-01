package com.me.jaxb;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class ObjectToXmlDriver {
	
	public static final String FILE_NAME = "exampleObject.xml";
	
	public static void main(String[] args) throws JAXBException {
		Marshaller marshaller = (JAXBContext.newInstance(
				ExampleObject.class)).createMarshaller();
		
		marshaller.marshal(new ExampleObject("newname", "somethingelsevalue"), new File(FILE_NAME));
	}

}
