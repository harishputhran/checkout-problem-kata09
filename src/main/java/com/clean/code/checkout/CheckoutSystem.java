package com.clean.code.checkout;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CheckoutSystem {

	public double calculateTotatlPrice(List<String> itemsForBillingAtCheckout) {
		Double totalItemPrice = Double.valueOf(0.0);
		Map<String, Double> itemPriceMap = new HashMap<>();
		itemPriceMap.put("A", Double.valueOf(50.0));
		itemPriceMap.put("B", Double.valueOf(30.0));
		
		if(itemsForBillingAtCheckout != null){
			for(String item : itemsForBillingAtCheckout){
				totalItemPrice += itemPriceMap.getOrDefault(item, totalItemPrice);
			}			
		}			
		return totalItemPrice;
	}

}
