package org.koushik.javabrains;

//import org.springframework.beans.factory.support.DefaultListableBeanFactory;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.core.io.FileSystemResource;

public class DrawingApp {



	public static void main(String[] args) {
		// old school method of just object instantiation
		//Triangle triangle = new Triangle();
		
		// Using spring, but using a bean factory.  
		//DefaultListableBeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		//Triangle triangle = (Triangle) factory.getBean("triangle");
		System.out.println("Start");
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		System.out.println("created Context");
		Triangle triangle = (Triangle) context.getBean("triangle");
		Triangle triangleSingleton = (Triangle) context.getBean("triangle");
		//System.out.println(triangle.getType());  // retrieved from default value assigned in spring.xml
		
		triangle.draw();  // uses setters for dependency injection
		//triangleSingleton.setType("Isosceles ");
		//triangleSingleton.draw();
		//triangle.draw();  // should now be isosceles  due to the bean being a SINGLETON scope

		
		//Rectangle rectangle = (Rectangle) context.getBean("rectangle");
		//rectangle.draw();    // uses constructor for dependency injection
		
		// proof of prototype scope
		//Rectangle rectangle2 = (Rectangle) context.getBean("rectangle");
		//rectangle2.setColor("blue");
		//rectangle2.draw();    
		//rectangle.draw();  // stays black
		
		Circle circle = (Circle) context.getBean("circle");
		circle.draw();    // uses constructor, but specifies type to determine WHICH constructor to use
		
		
		//TriangleAutowired triangleAw = (TriangleAutowired) context.getBean("autowiredTriangle");
		//triangleAw.draw();  // uses setters for dependency injection
		
		//Triangle triangle1 = (Triangle) context.getBean("triangle1");
		//triangle1.draw();
		
		//Triangle triangle2 = (Triangle) context.getBean("triangle2");
		//triangle2.draw();
		
		//Rectangle rectangle3 = (Rectangle) context.getBean("threeDRectangle");
		//rectangle3.draw();
		
		// using interface
		Shape shape = (Shape) context.getBean("circle");  
		shape.draw();

	}

}
