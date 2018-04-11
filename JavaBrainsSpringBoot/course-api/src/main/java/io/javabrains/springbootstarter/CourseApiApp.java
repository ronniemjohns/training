package io.javabrains.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseApiApp {

	public static void main(String[] args) {
		
		/*
		 *  one line that tells spring to:
		 *  1. Start this application
		 *  2. Create a servlet container
		 *  3. Host this application in that servlet container
		 */
		SpringApplication.run(CourseApiApp.class, args);
		
		/*
		 * But what does it do behind the scenes?
		 * 1. Sets up default config
		 * 2. Starts Spring application context
		 * 3. Performs class path scan
		 * 4. Starts Tomcat server
		 */

	}

}
