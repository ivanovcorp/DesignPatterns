package e_01_CreationalPatterns.Singleton;

public class PersonManager {
	
	private static PersonManager instance;
	
	private PersonManager() {
	}
	
	public static PersonManager getInstance() {
		if (instance == null) {
			return new PersonManager();
		}
		return instance;
	}
}
