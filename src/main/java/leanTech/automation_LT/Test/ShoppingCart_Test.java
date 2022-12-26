package leanTech.automation_LT.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;

import com.codeborne.selenide.ElementsCollection;

import leanTech.automation_LT.PageObjects.ShoppingCart_PageObject;

public class ShoppingCart_Test {

	public static void CartItems() {
		
		//first click at the cart button at the top of the page
		ShoppingCart_PageObject.clickButtonCart();
		//validate items at the cart if the items from inventory match with the cart page
		ShoppingCart_PageObject.validateCartItems();
		//if all is fine will click to checkout the order
		ShoppingCart_PageObject.clickCheckoutCart();
		
	}
	
}
