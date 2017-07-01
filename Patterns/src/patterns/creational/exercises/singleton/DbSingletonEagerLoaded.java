package patterns.creational.exercises.singleton;

public class DbSingletonEagerLoaded {
	
	private static DbSingletonEagerLoaded instance = null;
	
	static {
		instance = new DbSingletonEagerLoaded();
		System.out.println("loading DbSingletonEagerLoaded via static block");
	}

	public static DbSingletonEagerLoaded getInstance() {
		return instance;
	}
	
	private DbSingletonEagerLoaded() {
		
	}


}
