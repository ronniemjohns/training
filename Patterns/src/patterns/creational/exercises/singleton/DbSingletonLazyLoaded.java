package patterns.creational.exercises.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbSingletonLazyLoaded {

	/*  Note that his uses a lazy loading pattern, which MAY or MAY NOT be the most effective 
	 *  use here.  
	 *  
	 *  It SEEMS to me:
	 *  •	Use lazy loading if you are worried about startup performance and you aren’t sure whether the singleton will ALWAYS (usually) be used in a given transaction.
	 *  •	Use eager loading if you’re worried about transaction performance, don’t care about startup performance and are sure that the singleton will always (usually) be used in most (all) transactions
	 *  
	 *  http://way2java.com/hibernate/difference-between-eager-initialization-and-lazy-initialization/
	 */
	private static DbSingletonLazyLoaded instance = null;
	private Connection conn = null;
	
	public static DbSingletonLazyLoaded getInstance() {
		// below if statement makes it lazy loaded (instead of doing a new at definition above)
		if(instance == null) {
			// below creates the least impactful thread safety.  
			// Note instance null check again due to possible threads
			synchronized(DbSingletonLazyLoaded.class) {
				if(instance==null) {
					instance = new DbSingletonLazyLoaded();
				}
			}
		}
		return instance;
	}
	
	private DbSingletonLazyLoaded() {
		try {
			DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
	}
	
	public Connection getConnection() {
		if(conn == null) {
			try {
				String dbUrl = "jdbc:derby:memory:codejava/webdb;create=true";
				
				conn = DriverManager.getConnection(dbUrl);
			} catch (SQLException sqle) {
				sqle.printStackTrace();
			}
		}
		
		return conn;
	}
}
