package com.me.jaxb;

import java.io.File;
import java.io.IOException;

import javax.xml.bind.SchemaOutputResolver;
import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;

public class MySchemaOutputResolver  extends SchemaOutputResolver {

	@Override
	public Result createOutput(String arg0, String arg1) throws IOException {
		return new StreamResult(new File("ExampleObject.xsd"));
	}

}
