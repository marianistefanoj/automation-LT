package leanTech.automation_LT.Test;

import org.testng.annotations.Test;


import leanTech.automation_LT.PageObjects.Login_PageObject;

public class Login_Test extends Login_PageObject{
	
	public static void login() {
		openURL();
		userName();
		password();
		clickLogin();
	}
}
