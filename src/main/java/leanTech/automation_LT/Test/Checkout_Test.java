package leanTech.automation_LT.Test;

import leanTech.automation_LT.PageObjects.Checkout_PageObjects;

public class Checkout_Test {
	
	public static void doCheckout() {
		//main infos for checkout
		Checkout_PageObjects.firstName("Lean");
		Checkout_PageObjects.lastName("Tech");
		Checkout_PageObjects.zipPostalCode("050022");
		//click to continue the checkout
		Checkout_PageObjects.buttonContinueCheckout();
		//validate again the items from inventory > cart > checkout
		Checkout_PageObjects.validateCheckoutItems();
		//confirm the checkout clicking at the finish button
		Checkout_PageObjects.buttonFinishCheckout();
		//validate if is exactly at the 'end of the checkout'
		Checkout_PageObjects.validateCheckoutComplete();
	}
}
