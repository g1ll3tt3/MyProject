package project.common;

public class StringUtils {
	private static StringUtils instance = null;
	
	public static StringUtils getInstance() {
		if (instance == null)
			instance = new StringUtils();
		
		return instance;
	}
	
	public String encryptPassword(String pwd) {
		//TODO write encrypt password
		
		return null;
	}
}
