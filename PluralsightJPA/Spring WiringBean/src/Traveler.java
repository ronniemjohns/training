import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.beans.BeansException;;


public class Traveler {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Travel.xml");
		
		Car car = (Car)ctx.getBean("car");
		
		car.move();
	}

}
