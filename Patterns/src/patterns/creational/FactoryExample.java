package patterns.creational;

import java.util.Calendar;

public class FactoryExample {
	
	public static void main(String[] args) {
		
		//actual concrete implementation is java.util.GregorianCalendar
		Calendar cal = Calendar.getInstance();  
		
		System.out.println(cal);
		
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
	}
	
}
