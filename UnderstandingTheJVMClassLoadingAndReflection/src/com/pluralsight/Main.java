package com.pluralsight;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class Main {
	public static void main(String[] args) {
		//com.other.Helper helper = new com.other.Helper();
		//System.out.println(helper.getMessage());
		URL url;
		
		try {
			url = new URL("file:///d:/dev/workspace/training/UnderstandingTheJVMClassLoadingAndReflection/lib/Quoter.jar");
			URLClassLoader ucl = new URLClassLoader(new URL[]{url});
			Class clazz = ucl.loadClass("com.mantiso.Quote");
			Object o = clazz.newInstance();
			System.out.println(o.toString());
		} catch (MalformedURLException | ClassNotFoundException 
				| InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
