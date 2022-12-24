package leanTech.automation_LT.PageObjects;

import static com.codeborne.selenide.Selenide.*;
import leanTech.automation_LT.Test.*;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;

public class ShoppingCart_PageObjects {
	
		public static void clickButtonCart() {
			$("#shopping_cart_container a").click();
		}
		
		public static void clickCheckoutCart() {
			$("#checkout").click();
		}
		
		public static void validateCartItems() {
			//Create elements collections from items at the cart
			ElementsCollection cartElements = (ElementsCollection) $$(".inventory_item_name");
			//turn the elements coolection into a list to compare with the list that has been added
			List<String> cartItems = new ArrayList<String>();
			
			//receive the list with the name of the items that have been added to the cart at inventory
			List<String> inventoryItems = Inventory_PageObjects.elementsTextAddedToCart;
			
			//Get elements from elements collection and add into array
			for(int i = 0; i < cartElements.size(); i++) {
				cartItems.add(cartElements.get(i).text());
				//System.out.println(elements.get(i).toString());
			}
			//assert if the two lists matches
			Assert.assertEquals(cartItems, inventoryItems);
		}

}
