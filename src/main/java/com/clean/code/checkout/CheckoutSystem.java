package com.clean.code.checkout;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CheckoutSystem {

	public double calculateTotatlPrice(List<String> itemsForBillingAtCheckout) {
		Double zeroPrice = Double.valueOf(0.0);
		Map<String, Double> itemPriceMap = new HashMap<>();
		itemPriceMap.put("A", Double.valueOf(50.0));
		itemPriceMap.put("B", Double.valueOf(30.0));
		
		if(itemsForBillingAtCheckout != null && itemsForBillingAtCheckout.size() == 1){
			return itemPriceMap.getOrDefault(itemsForBillingAtCheckout.get(0), zeroPrice);			
		}			
		return zeroPrice;
	}

}
