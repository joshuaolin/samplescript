package objects;

public class loginPage {

	static String usernameField = "//input[@id='user_id']";
	static String passwordField = "//input[@id='password']";
	static String loginButton = "//button[@name='signin']";
	
	
	public static String getUsernameField() {
		return usernameField;
	}
	
	public static String getPasswordField() {
		return passwordField;
	}
	
	public static String getLoginButton() {
		return loginButton;
	}
	


}
