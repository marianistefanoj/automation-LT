package leanTech.automation_LT.Test;

import leanTech.automation_LT.PageObjects.Checkout_PageObject;

public class Checkout_Test {
	
	public static void doCheckout() {
		//main infos for checkout
		Checkout_PageObject.firstName("Lean");
		Checkout_PageObject.lastName("Tech");
		Checkout_PageObject.zipPostalCode("050022");
		//click to continue the checkout
		Checkout_PageObject.buttonContinueCheckout();
		//validate again the items from inventory > cart > checkout
		Checkout_PageObject.validateCheckoutItems();
		//confirm the checkout clicking at the finish button
		Checkout_PageObject.buttonFinishCheckout();
		//validate if is exactly at the 'end of the checkout'
		Checkout_PageObject.validateCheckoutComplete();
	}
}
