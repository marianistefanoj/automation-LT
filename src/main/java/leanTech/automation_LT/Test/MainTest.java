package leanTech.automation_LT.Test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class MainTest  {
	
	@Test
	//SJM - 24/12/22 - This will look for Backpack item and will add the item from inventory to the cart
	public void selectBackPackItem() {
		Login_Test.login();
		Inventory_Test.addItemInventory("Backpack");
		ShoppingCart_Test.CartItems();
		Checkout_Test.doCheckout();
	}
	
	
	@Test
	//SJM - 24/12/22 - This will look for Sauce Labs items and will add all the items with sauce labs name from inventory to the cart
	public void selectMultipleItems() {
		Login_Test.login();
		Inventory_Test.addItemInventory("Sauce Labs");
		ShoppingCart_Test.CartItems();
		Checkout_Test.doCheckout();
	}
	
	
	@Test
	//SJM - 24/12/22 - This will look for 'ASD' items and will add all the items with sauce labs name from inventory to the cart
	public void selectNoneItemFound() {
		Login_Test.login();
		Inventory_Test.addItemInventory("ASD");
		ShoppingCart_Test.CartItems();
		Checkout_Test.doCheckout();
	}
	
}
