package com.clean.code.checkout;

import java.util.List;

public class CheckoutSystem {

	public double calculateTotatlPrice(List<String> itemsForBillingAtCheckout) {
		if(itemsForBillingAtCheckout != null && itemsForBillingAtCheckout.size() == 1 && itemsForBillingAtCheckout.contains("A")){
			return 50.0d;
		}
		if(itemsForBillingAtCheckout != null && itemsForBillingAtCheckout.size() == 1 && itemsForBillingAtCheckout.contains("B")){
			return 30.0d;
		}		
		return 0.0;
	}

}
