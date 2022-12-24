package leanTech.automation_LT.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import leanTech.automation_LT.PageObjects.Inventory_PageObjects;

public class Inventory_Test {
	
	public static void addItemInventory(String item) {
		//verify if contains an item that matches with the name: ex Backpack > Sauce Labs Backpack
		Inventory_PageObjects.validateInventoryItem(item);
		//if contains will add the item to the cart
		Inventory_PageObjects.addElementoToCart();
	}
	

	/*
	//SJM - 23/12/22 - Initial model from the class
	//the list that later will be compared at ShoppingCart_PageObjects
	public static List<String> elementsTextAddedToCart;
	
	public static void addItemToCart(String inputItem) {
		
		//Elements Collection from inventory items
		ElementsCollection elements = (ElementsCollection) $$(".inventory_item .inventory_item_label a"); //list of elements
		//List of values from inventory items
		List<String> elementsTexts = new ArrayList<String>();
		//list of elements that matches with the input user data and the inventory to be added to cart
		List<String> foundElement = new ArrayList<String>();
		
		//add the ElementsCollection into a String list for future comparisons
		for(int i = 0; i < elements.size(); i++) {
			elementsTexts.add(elements.get(i).text());
			//System.out.println(elements.get(i).toString());
		}
	
		//verify if the 'inputItem' matches to any elementsTexts from list created with the return of the items from inventory page
		for(int x = 0; x < elementsTexts.size(); x++) {
			if(elementsTexts.get(x).toString().contains(inputItem)) {
				System.out.println(elementsTexts.get(x).toString());
				foundElement.add(elementsTexts.get(x).toString());
				
			}
		}
		System.out.println("Partial Item Name : " + inputItem + ", Item that has been found : " + foundElement);
		
		//add values from elements found to public list to compare at the cart
		elementsTextAddedToCart = foundElement;
		System.out.println(elementsTextAddedToCart);
		
		for(int n = 0; n < foundElement.size(); n++) { 
			//using xpath looks for an element with the same text that has been returned from the earlier steps
			//navigate through the dom looking for the add to cart button from the desirable element
			//1st - <div class="inventory_item_name">Sauce Labs Backpack</div></a>
			//2nd - <a href="#" id="item_4_title_link">
			//3rd - <div class="inventory_item_label">
			//4th - <div class="inventory_item_description">
			//5th - looks for the button at the three using // going right to class pricebar > class inventory_item_price > button
			//included the option for multiple items to add to cart
			SelenideElement addToCartButton= $(By.xpath("//*[text()='"+ foundElement.get(n).toString() +"']/../../..//button"));
			
			//click ad the button and add the item to the cart
			addToCartButton.click();
			
			//validate if the button after clicked has the label 'REMOVE' instead 'ADD TO CART', it means that the item has been added
			addToCartButton.shouldHave(Condition.exactText("REMOVE"));
		}

	}
	*/
}
