package leanTech.automation_LT.PageObjects;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.*;

import com.codeborne.selenide.Selenide;

public class Login_PageObjects {

	public static String main_url = "https://www.saucedemo.com/";
	private static String userName = "standard_user";
	private static String password = "secret_sauce";
	
	public static void openURL() {
		open(main_url);
	}
	
	public static void userName() {
		$("#user-name").sendKeys(userName);
	}
	
	public static void password() {
		$("#password").sendKeys(password);
	}
	
	public static void clickLogin() {
		$("#login-button").click();
	}
	
}
