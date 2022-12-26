package leanTech.automation_LT.PageObjects;

import static com.codeborne.selenide.Selenide.*;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import leanTech.automation_LT.Test.Inventory_Test;

public class Checkout_PageObject {

	public static void firstName(String name) {
		$("#first-name").setValue(name);
	}
	
	public static void lastName(String lastName) {
		$("#last-name").setValue(lastName);
	}
	
	public static void zipPostalCode(String code) {
		$("#postal-code").setValue(code);
	}
	
	public static void buttonContinueCheckout() {
		$("#continue").click();
	}
	
	public static void buttonFinishCheckout() {
		$("#finish").click();
	}
	
	public static void validateCheckoutItems() {
		//Create elements collections from items at the cart
		ElementsCollection checkoutElements = (ElementsCollection) $$(".inventory_item_name");
		//turn the elements coolection into a list to compare with the list that has been added
		List<String> checkoutItems = new ArrayList<String>();
		
		//receive the list with the name of the items that have been added to the cart at inventory
		List<String> inventoryItems = Inventory_PageObject.elementsTextAddedToCart;
		
		if(!checkoutElements.isEmpty()) { 
			//Get elements from elements collection and add into array
			for(int i = 0; i < checkoutElements.size(); i++) {
				checkoutItems.add(checkoutElements.get(i).text());
				//System.out.println(elements.get(i).toString());
			}
			Assert.assertEquals(checkoutItems, inventoryItems);
		} else {
			Assert.assertEquals(checkoutItems, inventoryItems);
			System.out.println("The Checkout Cart is Empty");
		}
	}
	
	public static void validateCheckoutComplete() {
		//validate header text
		SelenideElement headerText = $("#header_container .header_secondary_container .title");
		headerText.should(Condition.exist);
		headerText.shouldHave(Condition.text("CHECKOUT: COMPLETE!"));
		//validate success message text
		SelenideElement successCheckout = $("#checkout_complete_container");
		successCheckout.should(Condition.exist);
		// validate if the text match with the expected text
		successCheckout.shouldHave(Condition.text("THANK YOU FOR YOUR ORDER"));
		// validate if the button back home exists than click on it
		SelenideElement buttonBackHome = $("#back-to-products");
		buttonBackHome.should(Condition.exist);
		buttonBackHome.click();
		
	}
}
