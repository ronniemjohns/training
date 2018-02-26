package com.testing.restexample.database;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.h2.tools.RunScript;



public class DatabaseLoader {
	private final String DBLOADER_FILE = "dbLoader.sql";
	
	Connection connection;
	
	
	public void loadDatabase() { 
		try {
			Class.forName("org.h2.Driver");
			connection = DriverManager.getConnection("jdbc:h2:~/test");
			InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(DBLOADER_FILE);
			BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
			String line = null;
			while((line = reader.readLine()) != null) {
				System.out.println(line);
				
			}
			RunScript.execute(connection, reader);
			System.out.println("loaded database!");
			
		} catch (Exception e) {
			System.out.println("Unable to load database: " + e.getMessage());
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		          
	}

	

}
