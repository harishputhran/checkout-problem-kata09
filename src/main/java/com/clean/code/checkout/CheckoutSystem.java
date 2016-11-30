package com.clean.code.checkout;

import java.util.List;

import com.clean.code.checkout.item.Item;

public class CheckoutSystem {

	public double calculateTotatlPrice(List<Item> itemsForBillingAtCheckout) {
		Double totalItemPrice = Double.valueOf(0.0);

		if(itemsForBillingAtCheckout != null){			
			for(Item item : itemsForBillingAtCheckout){
				totalItemPrice += item.getPrice();
			}
		}		
		return totalItemPrice;
	}
}
