package com.pluralsight;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
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
		
		
		Class cls = Car.class;
		Method[] methods = cls.getMethods();
		for(Method method : methods) {
			System.out.print(method.getName());
			int count = method.getParameterCount();
			System.out.println(" - with " + count + " parameter");
		}
		
		System.out.println("===============================");
		methods = cls.getDeclaredMethods();
		for(Method method : methods) {
			System.out.print("Declared method: " + method.getName());
			int count = method.getParameterCount();
			System.out.println(" - with " + count + " parameter");
		}
		
		Class superClass = cls.getSuperclass();
		while(superClass != null) {
			System.out.println(superClass.getName());
			superClass = superClass.getSuperclass();
		}
		
		Constructor[] constructors = cls.getDeclaredConstructors();
		for(Constructor c : constructors) {
			System.out.println(c.getName() + " has " + c.getParameterCount() + " parms");
			Parameter[] parameters = c.getParameters();
			for(Parameter p : parameters) {
				System.out.println( c.getName() + " has the parameters named " + 
						p.getName() + " with type " + p.getType());
			}
		}
		
		// you can do the same with methods. using method.getParameters
		// you can do the same with fields using cls.getDeclaredFields, and then field.getName, field.getType
		
	}
}
