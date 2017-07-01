package patterns.creational.exercises.singleton;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DbSingletonDemo {

	public static void main(String[] args) {
		
		long timeBefore = 0;
		long timeAfter = 0;
		
		DbSingletonLazyLoaded instance = DbSingletonLazyLoaded.getInstance();
		
		/*
		System.out.println(instance);
		
		DbSingletonLazyLoaded anotherInstance = DbSingletonLazyLoaded.getInstance();
		
		System.out.println(anotherInstance);
		
		DbSingletonEagerLoaded eagerInstance = DbSingletonEagerLoaded.getInstance();
		System.out.println(eagerInstance);
		
		DbSingletonEagerLoaded eagerInstance2 = DbSingletonEagerLoaded.getInstance();
		System.out.println(eagerInstance2);
		*/
		
		timeBefore = System.currentTimeMillis();
		Connection conn= instance.getConnection();
		timeAfter = System.currentTimeMillis();
		
		System.out.println(timeAfter - timeBefore);
		
		Statement stmt;
		try {
			stmt = conn.createStatement();
			int count = stmt.executeUpdate("Create table address (id int, "
					+ "streetname varchar(20), Cit varchar(20))");
			System.out.println("Table created");
			stmt.close();
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
		
		timeBefore = System.currentTimeMillis();
		Connection conn2= instance.getConnection();
		timeAfter = System.currentTimeMillis();
		System.out.println(timeAfter - timeBefore);
		
	}
}
