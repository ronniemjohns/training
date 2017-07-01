package com.me.jaxb;

import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

public class ObjectToSchemaDriver {

	public static void main(String[] args) throws IOException, JAXBException {
		JAXBContext.newInstance(ExampleObject.class).generateSchema(new MySchemaOutputResolver());
	}
}
